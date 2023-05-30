package app.desing.pattern.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
public class Address {
    @Column(nullable = false)
    private String cep;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String neighborhood;
    @Column(nullable = false)
    private String number;

    public Address() {
    }

    public Address(String cep, String street, String neighborhood, String number) {
        this.cep = cep;
        this.street = street;
        this.neighborhood = neighborhood;
        this.number = number;
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
