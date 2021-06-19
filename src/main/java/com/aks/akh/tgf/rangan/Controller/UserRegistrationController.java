package com.aks.akh.tgf.rangan.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aks.akh.tgf.rangan.entity.Registration;

@Controller
public class UserRegistrationController {


    @RequestMapping(value="/userregistration", method = RequestMethod.GET)
    public String showUserRegistration(ModelMap model){
    	Registration registration = new Registration();
    	model.addAttribute("registration",registration);
        
        return "userregistration";
    }
    
    
    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("registration")Registration registration, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        System.out.println("First and Last Name :"+registration.getFirstName()+" "+registration.getLastName());
        return "login";
    }
}