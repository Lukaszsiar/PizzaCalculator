package com.example.pizzaCalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("inputFlour") String inputFlour, Model model) {
        model.addAttribute("inputFlour", inputFlour);
        return "result";
    }
}
