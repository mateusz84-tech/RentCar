package pl.matkoc.RentCar.services;

import pl.matkoc.RentCar.domain.model.User;

public interface UserService {

    User findByUserName(String name);

    void saveUser(User user);
}
