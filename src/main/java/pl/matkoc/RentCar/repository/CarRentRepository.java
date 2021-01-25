package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.matkoc.RentCar.domain.model.BranchOfCompany;
import pl.matkoc.RentCar.domain.model.CarRent;

import java.util.List;


public interface CarRentRepository extends JpaRepository<CarRent, Long> {

    @Query("SELECT c.name FROM CarRent c JOIN FETCH BranchOfCompany b GROUP BY b.city")
    List<CarRent> findAll();
}
