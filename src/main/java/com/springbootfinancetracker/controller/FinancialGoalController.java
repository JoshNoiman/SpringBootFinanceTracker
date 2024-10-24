package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.FinancialGoalDto;

/**
 * Controller for handling financial goal-related requests.
 */
@RestController
public class FinancialGoalController {

    /**
     * Fetches all financial goals.
     * @return the list of all financial goals
     */
    @GetMapping("/financialgoal")
    public List<FinancialGoalDto> getAllFinancialGoals() {
        return Arrays.asList(new FinancialGoalDto());
    }

    /**
     * Creates a new financial goal.
     * @param financialgoal the financial goal DTO
     * @return the created financial goal DTO
     */
    @PostMapping("/financialgoal")
    public FinancialGoalDto createFinancialGoalDto(@RequestBody FinancialGoalDto financialgoal) {
        System.out.println(financialgoal);
        return financialgoal;
    }

}
