package app.desing.pattern.service;

import app.desing.pattern.entity.Customer;

public interface ICustomerService {
    public Customer save(Customer customer);
    public Customer findById(Long id);
    public Boolean delete(Long id);
}
