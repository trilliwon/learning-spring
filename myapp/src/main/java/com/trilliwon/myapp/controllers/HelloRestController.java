package com.trilliwon.myapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/rest")
    public String greet(@RequestParam(required = false, defaultValue = "World") String name) {
        return String.format("Hello, %s!", name);
    }
}
