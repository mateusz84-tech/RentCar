package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.matkoc.RentCar.domain.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
