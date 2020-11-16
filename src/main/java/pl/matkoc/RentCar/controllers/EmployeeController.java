package pl.matkoc.RentCar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.matkoc.RentCar.domain.model.Employee;
import pl.matkoc.RentCar.repository.EmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/addEmployee")
    public String prepareAddEmployeeToRental(Model model){
        model.addAttribute("employee",new Employee());
        return "/employee/add";
    }
    @PostMapping("/addEmployee")
    public String processAddEmployee(Employee employee){
        employeeRepository.save(employee);
        return "redirect:/";
    }
}
