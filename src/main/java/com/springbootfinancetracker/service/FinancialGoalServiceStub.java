package com.springbootfinancetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springbootfinancetracker.dao.IFinancialGoalDao;
import com.springbootfinancetracker.dto.FinancialGoalDto;

public class FinancialGoalServiceStub implements IFinancialGoalService {

    @Autowired
    private IFinancialGoalDao financialGoalDao;

    @Override
    public FinancialGoalDto createFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception {
        return financialGoalDao.createFinancialGoal(financialGoalDto);
    }

    @Override
    public FinancialGoalDto updateFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception {
        return financialGoalDao.updateFinancialGoal(financialGoalDto);
    }

    @Override
    public FinancialGoalDto getFinancialGoalById(int id) throws Exception {
        return financialGoalDao.getFinancialGoalById(id);
    }

    @Override
    public List<FinancialGoalDto> getAllFinancialGoals() throws Exception {
        return financialGoalDao.getAllFinancialGoals();
    } 
}
