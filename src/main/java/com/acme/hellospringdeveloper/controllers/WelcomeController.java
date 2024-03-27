package com.acme.hellospringdeveloper.controllers;

import com.acme.hellospringdeveloper.model.WelcomeBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @GetMapping({"{name}"})
    public String welcomeDeveloper(@PathVariable String name) {
        return WelcomeBuilder.build(name);
    }

}
