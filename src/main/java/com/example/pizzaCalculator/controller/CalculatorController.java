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

    @PostMapping("/")
    public String submitForm(@RequestParam("inputFlour") Double inputFlour, Model model) {
        double yeast = Math.round(inputFlour * 0.002 * 10.0)/10.0;
        double water = Math.round(inputFlour * 0.65);
        double salt = Math.round(inputFlour * 0.03);
        model.addAttribute("inputFlour", inputFlour);
        model.addAttribute("inputYeast", yeast);
        model.addAttribute("inputWater", water);
        model.addAttribute("inputSalt", salt);
        return "form";
    }
}
