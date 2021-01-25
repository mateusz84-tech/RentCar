package pl.matkoc.RentCar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.matkoc.RentCar.repository.CarRentRepository;

@Controller
@RequestMapping("/")
public class HomeController {

    private final CarRentRepository carRentRepository;

    public HomeController(CarRentRepository carRentRepository) {
        this.carRentRepository = carRentRepository;
    }

    @GetMapping
    public String showHomePage(){
        return "/mainPages/homePage";
    }
//    @ModelAttribute("rent")
//    public List<CarRental> carRentalList(){
//        return rentRepository.findAll();
//    }
}
