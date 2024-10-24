package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.BudgetDto;

/**
 * Controller for handling budget-related requests.
 */
@RestController
public class BudgetController{

    /**
     * Fetches all budgets.
     * @return the list of all budgets
     */
    @GetMapping("/budget")
    public List<BudgetDto> getAllBudgets() {
        return Arrays.asList(new BudgetDto());
    }

    /**
     * Creates a new budget.
     * @param budget the budget DTO
     * @return the created budget DTO
     */
    @PostMapping("/budget")
    public BudgetDto createBudgetDto(@RequestBody BudgetDto budget) {
        System.out.println(budget);
        return budget;
    }
}