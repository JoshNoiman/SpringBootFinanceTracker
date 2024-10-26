package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.BudgetDto;
import com.springbootfinancetracker.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
/**
 *
 */
public class BudgetDaoStub implements IBudgetDao {

    Map<Integer, BudgetDto> allBudgets = new HashMap<>();

    /**
     * Saves budget to associated user
     * @param budgetDto
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto createBudget(BudgetDto budgetDto) throws Exception {
        return null;
    }

    /**
     * Updates budget to associated user
     * @param budgetDto
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto updateBudget(BudgetDto budgetDto) throws Exception {
        return null;
    }

    /**
     * Get the budget from user Id
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto getBudgetById(int id) throws Exception {
        return null;
    }

    /**
     * Grab all budgets stored
     * @return
     * @throws Exception
     */
    @Override
    public List<BudgetDto> getAllBudgets() throws Exception {
        return List.of();
    }
}
