package pl.matkoc.RentCar.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.matkoc.RentCar.domain.model.CarRental;

import java.util.List;

public interface CarRentRepository extends JpaRepository<CarRental, Long> {

    @Override
    List<CarRental> findAll();
}
