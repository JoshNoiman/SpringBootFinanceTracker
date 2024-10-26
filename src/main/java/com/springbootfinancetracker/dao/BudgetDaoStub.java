package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.BudgetDto;
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
     * @param budget
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto createBudget(BudgetDto budget) throws Exception {
        // TODO Auto-generated method stub
        allBudgets.put(budget.getBudgetID(), budget);
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    /**
     * Updates budget to associated user
     * @param budget
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto updateBudget(BudgetDto budget) throws Exception {
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
