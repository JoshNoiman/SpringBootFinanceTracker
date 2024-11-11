package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dao.IFinancialGoalDao;
import com.springbootfinancetracker.dto.FinancialGoalDto;
import com.springbootfinancetracker.service.IFinancialGoalService;

@RestController
public class FinancialGoalController {

    @Autowired
    IFinancialGoalService iFinancialGoalService;



    @GetMapping("/financialgoal")
    public List<FinancialGoalDto> getAllFinancialGoals() throws Exception {
        return iFinancialGoalService.getAllFinancialGoals();
    }

    @PostMapping("/financialgoal")
    public FinancialGoalDto createFinancialGoalDto(@RequestBody FinancialGoalDto financialgoal) throws Exception {
        return iFinancialGoalService.createFinancialGoal(financialgoal);
    }

    @GetMapping("/financialgoal/{id}")
    public FinancialGoalDto getFinancialGoalById(@PathVariable int id) throws Exception {
        return iFinancialGoalService.getFinancialGoalById(id);
    }

    @PutMapping("/financialgoal")
    public FinancialGoalDto saveFinancialGoal(@RequestBody FinancialGoalDto financialGoalDto) throws Exception {
        return iFinancialGoalService.saveFinancialGoal(financialGoalDto);
    }





}
