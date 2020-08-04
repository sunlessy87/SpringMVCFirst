package com.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {

    @RequestMapping("/welcome")
    public String printWelcome() {
        return "welcome";
    }

    @RequestMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("message", "Spring 3 MVC - Hello World");
        return "index";
    }
}
