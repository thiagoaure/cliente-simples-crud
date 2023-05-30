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

    public Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    void setDocument(String document) {
        this.document = document;
    }

    public String getCep() {
        return cep;
    }

    void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    void setStreet(String street) {
        this.street = street;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getNumber() {
        return number;
    }

    void setNumber(String number) {
        this.number = number;
    }
}
