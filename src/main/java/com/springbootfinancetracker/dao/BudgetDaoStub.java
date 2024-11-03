package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.BudgetDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

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
        return budget;
    }

    /**
     * Updates budget to associated user
     * @param budget
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto updateBudget(BudgetDto budget) throws Exception {
        // TODO: Ensure budget matches the respecting userId
        int budgetId = budget.getBudgetID();
        allBudgets.put(budgetId, budget);
        return budget;
    }

    /**
     * Get the budget from user Id
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto getBudgetById(int id) throws Exception {
        BudgetDto fetchedBudget = new BudgetDto();
        fetchedBudget.setBudgetID(id);
        return fetchedBudget;
    }

    /**
     * Grab all budgets stored
     * @return
     * @throws Exception
     */
    @Override
    public List<BudgetDto> getAllBudgets() throws Exception {
        List<BudgetDto> allUserBudgets = new ArrayList<>(allBudgets.values());
        return allUserBudgets;
    }
}
