package com.jsp.Simple_Project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/simple")
public class SimpleController {

	
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/convert")
    public double convertCelsiusToKelvin(@RequestParam double celsius, Model model) {
        double kelvin = celsius + 273.15;

        model.addAttribute("celsius", celsius);
        model.addAttribute("kelvin", (double)kelvin);

        return (double)kelvin;
    }
}
