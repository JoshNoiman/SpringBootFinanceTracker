package com.springbootfinancetracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import com.springbootfinancetracker.dto.BudgetDto;

@RestController
public class BudgetController{

    @GetMapping("/budget")
    public ResponseEntity<List<BudgetDto>> getAllBudgets() {
        List<BudgetDto> budgets = List.of(new BudgetDto());
        return ResponseEntity.ok(budgets);
    }

    @PostMapping("/budget")
    public ResponseEntity<BudgetDto> createBudgetDto(@RequestBody BudgetDto budget) {
        System.out.println(budget);
        return ResponseEntity.status(201).body(budget);
    }

}