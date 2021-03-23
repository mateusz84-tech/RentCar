package pl.matkoc.RentCar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.matkoc.RentCar.domain.model.User;
import pl.matkoc.RentCar.services.UserService;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/","/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login/login");
        return modelAndView;
    }

    @GetMapping("/registration")
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @PostMapping("/registration")
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult){
        ModelAndView modelANdView = new ModelAndView();
        User userExist = userService.findUserByName(user.getUserName());
        if(userExist != null){
            bindingResult.rejectValue("userName","error.user",
                    "Taki użytkownik już istnieje");
        }
        if(bindingResult.hasErrors()){
            modelANdView.setViewName("login/registration");
        }
        else{
            userService.saveUser(user);
            modelANdView.addObject("Wiadomość", "Użytkownik został zarejestrowany");
            modelANdView.addObject("user",new User());
            modelANdView.setViewName("login/registration");
        }
        return modelANdView;
    }

}
