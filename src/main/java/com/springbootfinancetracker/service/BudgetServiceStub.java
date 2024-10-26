package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.BudgetDto;

import java.util.List;

public class BudgetServiceStub implements IBudgetService {
    /**
     * @param budget
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto createBudget(BudgetDto budget) throws Exception {
        return null;
    }

    /**
     * @param budget
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto updateBudget(BudgetDto budget) throws Exception {
        return null;
    }

    /**
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto getBudgetById(int id) throws Exception {
        return null;
    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public List<BudgetDto> getBudgets() throws Exception {
        return List.of();
    }]

}
