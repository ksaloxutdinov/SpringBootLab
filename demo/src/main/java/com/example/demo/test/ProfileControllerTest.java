package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test") // Load test profile
class ProfileControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private Environment environment;

    @Test
    void testProfileMessage() {
        ResponseEntity<String> response = restTemplate.getForEntity("/profile", String.class);
        assertEquals("Welcome to the Test Environment!", response.getBody());
    }

    @Test
    void testActiveProfile() {
        String[] activeProfiles = environment.getActiveProfiles();
        assertTrue(activeProfiles.length > 0, "No active profile found");
        assertEquals("test", activeProfiles[0], "Active profile is not 'test'");
    }
}
