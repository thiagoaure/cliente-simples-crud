package app.desing.pattern.dto;

import app.desing.pattern.entity.Customer;

public class CustomerResponseDTO {
    private Long id;
    private String name;
    private String telephone;
    private String email;
    private String document;
    private String cep;
    private String street;
    private String neighborhood;
    private String number;

    public CustomerResponseDTO(Customer customer) {
        this.name = customer.getName();
        this.telephone = customer.getTelephone();
        this.email = customer.getEmail();
        this.document = customer.getDocument();
        this.cep = customer.getAddress().getCep();
        this.street = customer.getAddress().getStreet();
        this.neighborhood = customer.getAddress().getNeighborhood();
        this.number = customer.getAddress().getNumber();
    }
}
