package pl.matkoc.RentCar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.matkoc.RentCar.domain.model.BranchOfCompany;
import pl.matkoc.RentCar.repository.BranchCompanyRepository;

import java.util.List;

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
        model.addAttribute("allBranch",branchCompanyRepository.findBranchOfCompany());
        return "/mainPages/homePage";
    }

}
