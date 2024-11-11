package com.springbootfinancetracker.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.springbootfinancetracker.dto.BudgetDto;
import com.springbootfinancetracker.dto.FinancialGoalDto;

@Repository
public class FinancialGoalDaoStub implements IFinancialGoalDao {

    Map<Integer, FinancialGoalDto> allFinancialGoals = new HashMap<>();

    @Override
    public FinancialGoalDto createFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception {
        allFinancialGoals.put(financialGoalDto.getGoalID(), financialGoalDto);
        return financialGoalDto;
    }

    @Override
    public FinancialGoalDto updateFinancialGoal(FinancialGoalDto financialGoalDto) throws Exception {
        int financialGoalID = financialGoalDto.getGoalID();
        allFinancialGoals.put(financialGoalID, financialGoalDto);
        return financialGoalDto;
    }

    @Override
    public FinancialGoalDto getFinancialGoalById(int id) throws Exception {
        FinancialGoalDto fetchedFinancialGoal = new FinancialGoalDto();
        fetchedFinancialGoal.setGoalID(id);
        return fetchedFinancialGoal;
    }

    @Override
    public List<FinancialGoalDto> getAllFinancialGoals() throws Exception {
        List<FinancialGoalDto> financialGoalsList = new ArrayList<>(allFinancialGoals.values());
        return financialGoalsList;
    }

}
