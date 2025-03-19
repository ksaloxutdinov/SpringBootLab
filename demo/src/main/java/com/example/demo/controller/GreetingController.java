package com.example.demo.controller;

import com.example.demo.service.GreetingService;
import com.example.demo.service.FarewellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class GreetingController {
    private final GreetingService greetingService;
    private final FarewellService farewellService;

    @Autowired
    public GreetingController(GreetingService greetingService, FarewellService farewellService) {
        this.greetingService = greetingService;
        this.farewellService = farewellService;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingService.getGreeting();
    }

    @GetMapping("/farewell")
    public String farewell() {
        return farewellService.getFarewell();
    }
}
