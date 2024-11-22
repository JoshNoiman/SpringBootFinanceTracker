package com.springbootfinancetracker.service;

import java.util.List;

import com.springbootfinancetracker.dto.FinancialGoalDto;

public interface IFinancialGoalService {
    /**
     * 
     * @param financialGoalDto
     * @return
     * @throws Exception
     */
    public FinancialGoalDto createFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception;
    /**
     * 
     * @param financialGoalDto
     * @return
     * @throws Exception
     */
    public FinancialGoalDto updateFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception;
    /**
     * 
     * @param id
     * @return
     * @throws Exception
     */
    public FinancialGoalDto getFinancialGoalById(int id) throws Exception;
    /**
     * 
     * @return
     * @throws Exception
     */
    List<FinancialGoalDto> getAllFinancialGoals() throws Exception; 
}
