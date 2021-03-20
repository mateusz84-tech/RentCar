package pl.matkoc.RentCar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.matkoc.RentCar.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserName(String userName);
}
