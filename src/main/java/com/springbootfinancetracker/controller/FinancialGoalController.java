package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.FinancialGoalDto;

@RestController
public class FinancialGoalController {

    @GetMapping("/financialgoal")
    public List<FinancialGoalDto> getAllFinancialGoals() {
        return Arrays.asList(new FinancialGoalDto());
    }

    @PostMapping("/financialgoal")
    public FinancialGoalDto createFinancialGoalDto(@RequestBody FinancialGoalDto financialgoal) {
        System.out.println(financialgoal);
        return financialgoal;
    }

}
