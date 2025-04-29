package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/TestController")
    public String tostring () {
        return "Hello shopping online project";
    }

}
//http://localhost:8080/h