package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.matkoc.RentCar.domain.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
