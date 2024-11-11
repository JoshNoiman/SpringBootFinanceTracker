package com.springbootfinancetracker.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springbootfinancetracker.dto.FinancialGoalDto;

@Repository
public class FinancialGoalDaoStub implements IFinancialGoalDao {

    @Override
    public FinancialGoalDto createFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createFinancialGoal'");
    }

    @Override
    public FinancialGoalDto saveFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception {
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
