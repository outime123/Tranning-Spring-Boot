package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymleafController {
    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("name", "Linh nè <3");
        return "index";
    }
}
