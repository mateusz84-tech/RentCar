package pl.matkoc.RentCar.controllers;

import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.matkoc.RentCar.domain.model.BranchOfCompany;
import pl.matkoc.RentCar.repository.BranchCompanyRepository;

@Controller
@RequestMapping("/branch")
public class BranchCompanyController {

    private final BranchCompanyRepository branchCompanyRepository;
    private final Logger logger = LoggerFactory.getLogger(BranchCompanyController.class);

    public BranchCompanyController(BranchCompanyRepository branchCompanyRepository) {
        this.branchCompanyRepository = branchCompanyRepository;
    }

    @GetMapping("/add")
    public String prepareAddNewBranchCompany(Model model){
        model.addAttribute("newBranch",new BranchOfCompany());
        return "rent/addNewBrach";
    }
    @PostMapping("/add")
    public String processAddNewBranchCompany(BranchOfCompany branchOfCompany){
        logger.info("Przed zapisem: {}",getClass());
        branchCompanyRepository.save(branchOfCompany);
        logger.info("Po zapisie: {}",getClass());
        return "redirect:/";
    }
}
