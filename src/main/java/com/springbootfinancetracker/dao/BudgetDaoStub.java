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
     * @param budgetDto
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto createBudget(BudgetDto budgetDto) throws Exception {
        return null;
    }

    /**
     * @param budgetDto
     * @return
     * @throws Exception
     */
    @Override
    public BudgetDto updateBudget(BudgetDto budgetDto) throws Exception {
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
    public List<BudgetDto> getAllBudgets() throws Exception {
        return List.of();
    }
}
