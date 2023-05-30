package app.desing.pattern.controller;

import app.desing.pattern.dto.CustomerRequestDTO;
import app.desing.pattern.dto.CustomerResponseDTO;
import app.desing.pattern.entity.Customer;
import app.desing.pattern.service.CustomerService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    //@Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public CustomerResponseDTO saveCustomer(@RequestBody CustomerRequestDTO customer){
        var savedCustomer = this.customerService.save(customer.toEntityCustomer());
        return ResponseEntity.status(HttpStatus.CREATED).body(new CustomerResponseDTO(savedCustomer)).getBody();
    }

    @GetMapping("/{id}")
    public CustomerResponseDTO getById(@PathVariable("id") Long id){
        var customer = this.customerService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(new CustomerResponseDTO(customer)).getBody();
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteCustomer(@PathVariable Long id){
        return this.customerService.delete(id);
    }

}
