package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.BudgetDto;

import java.util.List;

public interface IBudgetService {
    BudgetDto createBudget(BudgetDto budget) throws Exception;
    BudgetDto updateBudget(BudgetDto budget) throws Exception;
    BudgetDto getBudgetById(int id) throws Exception;
    List<BudgetDto> getBudgets() throws Exception;
}
