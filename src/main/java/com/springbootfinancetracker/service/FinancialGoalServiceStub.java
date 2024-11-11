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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFinancialGoal'");
    }

    @Override
    public FinancialGoalDto updateFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveFinancialGoal'");
    }

    @Override
    public FinancialGoalDto getFinancialGoalById(int id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFinancialGoalById'");
    }

    @Override
    public List<FinancialGoalDto> getAllFinancialGoals() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllFinancialGoals'");
    } 
}
