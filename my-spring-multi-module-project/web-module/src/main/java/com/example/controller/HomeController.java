package com.example.controller;

import com.example.service.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final MyService myService;

    public HomeController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", myService.getMessage());
        return "index";
    }
}
