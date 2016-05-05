package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.PersonEntity;
import ru.kpfu.itis.service.StaffService;

/**
 * Created by Kamil on 04.05.16.
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    StaffService staffService;

    @RequestMapping(method = RequestMethod.GET)
    public String getProfilePage(Model model){
        PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String role = String.valueOf(person.getRole());

        if (role.equals("ROLE_ADMIN")){
            return "redirect:/admin";
        }

        if (role.equals("ROLE_STAFF")) {
            return "redirect:/staff";
        }

        StaffEntity staff = staffService.getStaffEntityById(person.getId());
        model.addAttribute("client", staff);
        return "test";
    }

}
