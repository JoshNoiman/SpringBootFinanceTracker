package com.springbootfinancetracker.dao;

import java.util.List;

import com.springbootfinancetracker.dto.BudgetDto;
import com.springbootfinancetracker.dto.FinancialGoalDto;

public interface IFinancialGoalDao {

    /**
     * 
     * @param financialGoalDto
     * @return
     * @throws Exception
     */
    FinancialGoalDto createFinancialGoal (FinancialGoalDto financialGoalDto) throws Exception;

    /**
     * 
     * @param financialGoalDto
     * @return
     * @throws Exception
     */
    FinancialGoalDto saveFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception;

    /**
     * 
     * @param id
     * @return
     * @throws Exception
     */
    FinancialGoalDto getFinancialGoalById(int id) throws Exception;

    /**
     * 
     * @return
     * @throws Exception
     */
    List<FinancialGoalDto> getAllFinancialGoals() throws Exception;
}
