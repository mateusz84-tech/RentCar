package pl.matkoc.RentCar.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.matkoc.RentCar.domain.model.BranchOfCompany;
import pl.matkoc.RentCar.repository.BranchCompanyRepository;

import java.util.Optional;
import java.util.function.Consumer;

@Controller
@RequestMapping("/")
public class HomeController {

    private final BranchCompanyRepository branchCompanyRepository;

    public HomeController(BranchCompanyRepository branchCompanyRepository) {
        this.branchCompanyRepository = branchCompanyRepository;
    }

    //
    @GetMapping
    public String showHomePage(Model model){
        model.addAttribute("rentals",branchCompanyRepository.findAll());
        return "/mainPages/homePage";
    }
    // todo opczaić optionale
    @GetMapping("/rent/getCarRent")
    public ModelAndView showToChoseRent(Long id){
        ModelAndView modelAndView = new ModelAndView();
        BranchOfCompany companyIdDB = branchCompanyRepository.findCompanyById(id);
        modelAndView.getModelMap().addAttribute("company",companyIdDB);
        modelAndView.setViewName("/rent/showCarRent");
        return modelAndView;
    }
}