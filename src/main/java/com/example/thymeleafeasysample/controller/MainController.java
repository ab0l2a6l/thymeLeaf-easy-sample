package com.example.thymeleafeasysample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;
    private List<String> languages = Arrays.asList("c", "c++", "java", "javaScript");

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("languages", languages);
        return "welcome";
    }


}
