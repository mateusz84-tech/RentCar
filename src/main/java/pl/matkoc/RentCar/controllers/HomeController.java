package pl.matkoc.RentCar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.matkoc.RentCar.domain.model.CarRental;
import pl.matkoc.RentCar.repository.CarRentRepository;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private CarRentRepository rentRepository;

    public HomeController(CarRentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    @GetMapping
    public String showHomePage(){
        return "/mainPages/homePage";
    }
    @ModelAttribute("rent")
    public List<CarRental> carRentalList(){
        return rentRepository.findAll();
    }
}
