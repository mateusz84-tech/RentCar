package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.matkoc.RentCar.domain.model.CarRental;

public interface CarRentRepository extends JpaRepository<CarRental, Long> {
}
