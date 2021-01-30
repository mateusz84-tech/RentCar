package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.matkoc.RentCar.domain.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
