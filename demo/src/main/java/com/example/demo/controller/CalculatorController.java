package com.example.demo.controller;

import com.example.demo.service.CalculatorService;
import com.example.demo.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;
    private final HistoryService historyService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService, HistoryService historyService) {
        this.calculatorService = calculatorService;
        this.historyService = historyService;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.add(a, b);
        historyService.log(a + " + " + b + " = " + result);
        return result;
    }

    @GetMapping("/history")
    public List<String> getHistory() {
        return historyService.getHistory();
    }
}
