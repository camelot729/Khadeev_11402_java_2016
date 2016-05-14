package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.entity.AdminEntity;
import ru.kpfu.itis.entity.PersonEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.service.AdminService;
import ru.kpfu.itis.service.StaffService;

/**
 * Created by Kamil on 05.05.16.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    StaffService adminService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAdminPage(Model model) {
        PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String role = String.valueOf(person.getRole());
        StaffEntity admin = adminService.getStaffEntityById(person.getId());
        model.addAttribute("admin", admin);
        return "admin_page";
    }
    @RequestMapping(value = "/expences", method = RequestMethod.GET)
    public String getAdminExpencesPage(Model model) {
        PersonEntity person = (PersonEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String role = String.valueOf(person.getRole());
        StaffEntity admin = adminService.getStaffEntityById(person.getId());
        model.addAttribute("admin", admin);
        return "admin_page_expences";
    }
}
