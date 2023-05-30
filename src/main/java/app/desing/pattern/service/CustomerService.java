package app.desing.pattern.service;

import app.desing.pattern.entity.Customer;
import app.desing.pattern.repository.ICustomerRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements  ICustomerService{

    private ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        var customerRes = customerRepository.findById(id);
        return  customerRes.orElseThrow();
    }

    @Override
    public Boolean delete(Long id) {
        try {
            var customer = this.findById(id);
            customerRepository.delete(customer);
            return  true;
        } catch (Exception e){
            return false;
        }
    }
}
