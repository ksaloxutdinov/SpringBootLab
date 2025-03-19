package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProfileControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void testProfileMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/profile", String.class);
        assertEquals("Welcome to the Test Environment!", response.getBody());
    }
}
