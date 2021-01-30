package pl.matkoc.RentCar.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.matkoc.RentCar.domain.model.Employee;
import pl.matkoc.RentCar.repository.EmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/add")
    public String processAddEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "employee/add";
    }
    @PostMapping("/add")
    public String processAddEmployee(Employee employee){
        employeeRepository.save(employee);
        return "redirect:/";
    }
}
