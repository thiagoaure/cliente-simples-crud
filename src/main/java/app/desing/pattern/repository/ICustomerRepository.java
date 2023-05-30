package app.desing.pattern.repository;

import app.desing.pattern.entity.Customer;;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {

}
