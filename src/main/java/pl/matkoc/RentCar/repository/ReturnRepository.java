package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.matkoc.RentCar.domain.model.Return;

public interface ReturnRepository extends JpaRepository<Return, Long> {
}
