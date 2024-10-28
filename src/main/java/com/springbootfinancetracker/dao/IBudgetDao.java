package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.BudgetDto;

import java.util.List;

public interface IBudgetDao {
    /**
     * Creates the budget for the associated UserId
     * @param budgetDto
     * @return new budget for associated userId
     */
    BudgetDto createBudget(BudgetDto budgetDto) throws Exception;

    /**
     *
     * @param budgetDto
     * @return
     */
    BudgetDto updateBudget(BudgetDto budgetDto) throws Exception;

    /**
     *
     * @param id
     * @return
     */
    BudgetDto getBudgetById(int id) throws Exception;

    /**
     *
     * @return
     */
    List<BudgetDto> getAllBudgets() throws Exception;
}
