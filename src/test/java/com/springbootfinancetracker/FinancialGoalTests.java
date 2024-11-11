package com.springbootfinancetracker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbootfinancetracker.dao.IBudgetDao;
import com.springbootfinancetracker.dao.IFinancialGoalDao;
import com.springbootfinancetracker.dto.BudgetDto;
import com.springbootfinancetracker.dto.FinancialGoalDto;
import com.springbootfinancetracker.service.BudgetServiceStub;
import com.springbootfinancetracker.service.FinancialGoalServiceStub;

@RunWith(SpringRunner.class)
@SpringBootTest
@Scope("session")

public class FinancialGoalTests {

    @Autowired
    @InjectMocks
    private FinancialGoalServiceStub financialGoalService;

    @MockBean
    private IFinancialGoalDao financialGoalDao;

    @Test
    public void testCreatingFinancialGoalForUser() throws Exception {
        // Arrange
        FinancialGoalDto financialGoal = new FinancialGoalDto();
        financialGoal.setGoalID(1);
        financialGoal.setTargetamount(200);
        financialGoal.setGoalName("concert tickets");
        financialGoal.setTargetDate(new Date(2024, 11, 11));

        when(financialGoalDao.createFinancialGoal(financialGoal)).thenReturn(financialGoal);

        // Act
        FinancialGoalDto createdFinancialGoal = financialGoalDao.createFinancialGoal(financialGoal);

        // Assert
        assertNotNull(createdFinancialGoal);
        assertEquals(Integer.valueOf(1), createdFinancialGoal.getGoalID());
        assertEquals(Integer.valueOf(200), createdFinancialGoal.getTargetamount());
        assertEquals("concert tickets", createdFinancialGoal.getGoalName());
        assertEquals(new Date(2024, 11, 11), createdFinancialGoal.getTargetDate());

        verify(financialGoalDao, times(1)).createFinancialGoal(createdFinancialGoal);
    }

    // @Test
    // public void testUpdatingTheBudgetForUser() throws Exception {
    //     // Arrange
    //     BudgetDto budget = new BudgetDto();
    //     budget.setBudgetID(1);
    //     budget.setCategory("Shopping");
    //     budget.setAmount(600);

    //     when(budgetDao.updateBudget(budget)).thenReturn(budget);

    //     // Act
    //     BudgetDto updatedBudget = budgetService.updateBudget(budget);

    //     // Assert
    //     assertNotNull(updatedBudget);
    //     assertEquals(Integer.valueOf(1), updatedBudget.getBudgetID());
    //     assertEquals("Shopping", updatedBudget.getCategory());
    //     assertEquals(Integer.valueOf(600), updatedBudget.getAmount());

    //     verify(budgetDao, times(1)).updateBudget(budget);

    // }

    // @Test
    // public void testGetBudgetById() throws Exception {
    //     // Arrange
    //     int budgetId = 1;
    //     BudgetDto budget = new BudgetDto();
    //     budget.setBudgetID(budgetId);
    //     budget.setCategory("Gas");
    //     budget.setAmount(100);

    //     when(budgetDao.getBudgetById(budgetId)).thenReturn(budget);

    //     // Act
    //     BudgetDto retrievedBudget = budgetService.getBudgetById(budgetId);

    //     // Assert
    //     assertNotNull(retrievedBudget);
    //     assertEquals(Integer.valueOf(budgetId), retrievedBudget.getBudgetID());
    //     assertEquals("Gas", retrievedBudget.getCategory());
    //     assertEquals(Integer.valueOf(100), retrievedBudget.getAmount());

    //     verify(budgetDao, times(1)).getBudgetById(budgetId);
    // }

    // @Test
    // public void testGetAllBudgets() throws Exception {
    //     // Arrange
    //     BudgetDto budget1 = new BudgetDto();
    //     budget1.setBudgetID(1);
    //     budget1.setCategory("Toys");
    //     budget1.setAmount(50);

    //     BudgetDto budget2 = new BudgetDto();
    //     budget2.setBudgetID(2);
    //     budget2.setCategory("Makeup");
    //     budget2.setAmount(100);

    //     List<BudgetDto> budgets = Arrays.asList(budget1, budget2);
    //     when(budgetDao.getAllBudgets()).thenReturn(budgets);

    //     // Act
    //     List<BudgetDto> retrievedBudgets = budgetService.getBudgets();

    //     // Assert
    //     assertNotNull(retrievedBudgets);
    //     assertEquals(2, retrievedBudgets.size());

    //     assertEquals("Toys", retrievedBudgets.get(0).getCategory());
    //     assertEquals(Integer.valueOf(50), retrievedBudgets.get(0).getAmount());

    //     assertEquals("Makeup", retrievedBudgets.get(1).getCategory());
    //     assertEquals(Integer.valueOf(100), retrievedBudgets.get(1).getAmount());

    //     verify(budgetDao, times(1)).getAllBudgets();
    // }
}
