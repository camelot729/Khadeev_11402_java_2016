package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.service.StaffService;

import javax.validation.Valid;

/**
 * Created by Kamil on 19.04.16.
 */

@Controller
@RequestMapping("/reg")
public class RegistrationController {

    @Autowired
    StaffService staffService;

    @RequestMapping(value = "/staff", method = RequestMethod.GET)
    public String getClientRegistrationPage(Model model){
        model.addAttribute("userform", new RegistrationForm());
        return "registration";
    }

    @RequestMapping(value = "/staff", method = RequestMethod.POST)
    public String getClientRegistration(@ModelAttribute("userform") @Valid RegistrationForm form, BindingResult result){

        if (result.hasErrors()) {
            return "registration";
        }

        staffService.saveNewClient(form);
        return "redirect:/login";
    }
}
