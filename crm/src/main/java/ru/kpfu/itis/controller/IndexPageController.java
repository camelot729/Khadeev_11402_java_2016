package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.itis.service.StaffService;

/**
 * Created by Kamil on 15.04.16.
 */
@Controller
@RequestMapping("/")
public class IndexPageController {
    @Autowired
    StaffService staffService;

    @RequestMapping("/")
    public String getIndexPage(Model model){
        return "login";
    }
}
