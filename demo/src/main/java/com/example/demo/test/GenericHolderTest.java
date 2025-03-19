package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorServiceImpl(); // Using direct instantiation
    }

    @Test
    void testAddition() {
        assertEquals(15, calculatorService.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calculatorService.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, calculatorService.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculatorService.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatorService.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
