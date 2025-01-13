package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/")
    public String getUser(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "user";  // This will map to user.jsp
    }
}
