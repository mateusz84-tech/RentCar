package pl.matkoc.RentCar.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.matkoc.RentCar.domain.model.CarRental;

import java.util.List;
import java.util.Optional;

public interface CarRentRepository extends JpaRepository<CarRental, Long> {

    @Override
    List<CarRental> findAll();

    @Override
    Optional<CarRental> findById(Long aLong);

    @Override
    CarRental getOne(Long aLong);
}
