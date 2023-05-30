package app.desing.pattern.dto;

import app.desing.pattern.entity.Address;
import app.desing.pattern.entity.Customer;

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

    public Customer toEntityCustomer() {
        return new Customer(
                name,
                telephone,
                email,
                document,
                new Address(
                        cep,
                        street,
                        neighborhood,
                        number
                )
        );
    }

}
