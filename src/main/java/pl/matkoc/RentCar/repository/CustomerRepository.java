package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.matkoc.RentCar.domain.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
