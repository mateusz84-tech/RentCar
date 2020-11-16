package pl.matkoc.RentCar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.matkoc.RentCar.domain.model.CarRental;
import pl.matkoc.RentCar.repository.CarRentRepository;

import java.util.Optional;

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
    @PostMapping("/add")
    public String processAddRentCarPage(CarRental carRental){
        carRentRepository.save(carRental);
        return "redirect:/";
    }
    @GetMapping("/getCarRent")
    public String prepareGetCarRentById(Model model, @RequestParam Long id){
        Optional<CarRental> carRental = carRentRepository.findById(id);
        carRental.ifPresent(rental -> model.addAttribute("carRentId", rental));
        return "/rent/showCarRent";
    }
}