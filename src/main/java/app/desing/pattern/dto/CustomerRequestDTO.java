package app.desing.pattern.dto;

import app.desing.pattern.entity.Address;
import app.desing.pattern.entity.Customer;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequestDTO {
    private Long id;
    private String name;
    private String telephone;
    private String email;
    private String document;
    private String cep;
    private String street;
    private String neighborhood;
    private String number;

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

    public Customer toEntityCustomer() {
        return new Customer(this.name ,this.telephone, this.email, this.document,
            new Address(
                this.cep,
                this.street,
                this.neighborhood,
                this.number
            )
        );
    }

}
