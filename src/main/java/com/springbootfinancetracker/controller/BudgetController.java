package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.BudgetDto;

@RestController
public class BudgetController{

    @GetMapping("/budget")
    public List<BudgetDto> getAllBudgets() {
        return Arrays.asList(new BudgetDto());
    }

    @PostMapping("/budget")
    public BudgetDto createBudgetDto(@RequestBody BudgetDto budget) {
        System.out.println(budget);
        return budget;
    }
}