package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FarewellService {
    public String getFarewell() {
        return "Goodbye from Spring Boot!";
    }
}
