package app.desing.pattern.entity;

import jakarta.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String telephone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, unique = true)
    private String document;

    @Column(nullable = false)
    @Embedded
    private Address address = new Address();

    public Long getId() {
        return id;
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

   public Address getAddress() {
        return address;
    }

    void setAddress(Address address) {
        this.address = address;
    }

    public Customer(String name, String telephone, String email, String document, Address address) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.document = document;
        this.address = address;
    }
    public Customer() {
    }
}
