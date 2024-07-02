package com.smartcontactmanager.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name","Ayush");
        model.addAttribute("gitRepository","https://github.com/Ayush-Ag11/scm.git");
        return "home";
    }

}
