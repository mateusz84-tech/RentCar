package pl.matkoc.RentCar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.matkoc.RentCar.domain.model.CarRental;
import pl.matkoc.RentCar.repository.CarRentRepository;

@Controller
@RequestMapping("/rent")
public class RentController {

    private final CarRentRepository carRentRepository;

    public RentController(CarRentRepository carRentRepository) {
        this.carRentRepository = carRentRepository;
    }

    @GetMapping("/add")
    public String prepareAddRentPage(Model model){
        model.addAttribute("rent", new CarRental());
        return "/rent/add";
    }
}
