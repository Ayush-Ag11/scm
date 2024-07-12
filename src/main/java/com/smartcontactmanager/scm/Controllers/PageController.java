package com.smartcontactmanager.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    private static final String HOME_VIEW = "home";
    private static final String ABOUT_VIEW = "about";
    private static final String SERVICES_VIEW = "services";

    private static final String NAME_ATTRIBUTE = "name";
    private static final String GIT_REPOSITORY_ATTRIBUTE = "gitRepository";

    private static final String DEFAULT_NAME = "Ayush";
    private static final String DEFAULT_GIT_REPOSITORY = "https://github.com/Ayush-Ag11/scm.git";

    @GetMapping("/home")
    public String home(Model viewModel) {
        viewModel.addAttribute(NAME_ATTRIBUTE, DEFAULT_NAME);
        viewModel.addAttribute(GIT_REPOSITORY_ATTRIBUTE, DEFAULT_GIT_REPOSITORY);
        return HOME_VIEW;
    }

    @GetMapping("/about")
    public String about() {
        return ABOUT_VIEW;
    }

    @GetMapping("/services")
    public String services() {
        return SERVICES_VIEW;
    }
}