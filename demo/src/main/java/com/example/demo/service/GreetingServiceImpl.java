package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("greetingService")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hello, Spring Boot!";
    }
}
