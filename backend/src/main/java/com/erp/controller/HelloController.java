package com.erp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This annotation indicates that this class is a REST controller, which means it will handle HTTP requests and return responses in a RESTful manner.
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Welcome to ERP System";
    }
}
