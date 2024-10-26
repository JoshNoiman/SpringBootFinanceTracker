package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dao.IBudgetDao;
import com.springbootfinancetracker.dto.BudgetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetServiceStub implements IBudgetService {

    @Autowired
    private IBudgetDao budgetDao;

    /**
     *
     */
    public BudgetServiceStub() {}

    /**
     *
     * @param budgetDao
     */
    public BudgetServiceStub(IBudgetDao budgetDao) {
        this.budgetDao = budgetDao;
    }

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
    }

}
