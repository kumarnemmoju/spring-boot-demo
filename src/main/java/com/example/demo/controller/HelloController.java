package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot! Application is working!";
    }

    @GetMapping("/")
    public String home() {
        return "Spring Boot Application is running successfully! "
                + "<br><br>Available endpoints:"
                + "<br><a href='/hello'>/hello</a> - Test endpoint"
                + "<br><a href='/status'>/status</a> - Application status";
    }

    @GetMapping("/status")
    public String status() {
        return "Application Status: RUNNING";
    }
}