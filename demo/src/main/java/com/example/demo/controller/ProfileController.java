package com.example.demo.controller;

import com.example.demo.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private AppProperties appProperties;

    @GetMapping("/name")
    public String getAppName() {
        return "Application Name: " + appProperties.getAppName();
    }
}
