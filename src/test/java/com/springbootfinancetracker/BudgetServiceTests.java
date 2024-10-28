package com.springbootfinancetracker;

import com.springbootfinancetracker.dao.IBudgetDao;
import com.springbootfinancetracker.dto.BudgetDto;
import com.springbootfinancetracker.service.BudgetServiceStub;
import jakarta.annotation.ManagedBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ManagedBean
@Scope("session")
public class BudgetServiceTests {

    @Autowired
    @InjectMocks
    private BudgetServiceStub budgetService;

    @MockBean
    private IBudgetDao budgetDao;

    @Test
    public void testCreatingTheBudgetForUser() throws Exception {
        // Arrange
        BudgetDto budget = new BudgetDto();
        budget.setBudgetID(1);
        budget.setCategory("Groceries");
        budget.setAmount(300);

        when(budgetDao.createBudget(budget)).thenReturn(budget);

        // Act
        BudgetDto createdBudget = budgetService.createBudget(budget);

        // Assert
        assertNotNull(createdBudget);
        assertEquals(Integer.valueOf(1), createdBudget.getBudgetID());
        assertEquals("Groceries", createdBudget.getCategory());
        assertEquals(Integer.valueOf(300), createdBudget.getAmount());

        verify(budgetDao, times(1)).createBudget(budget);

    }

    @Test
    public void testUpdatingTheBudgetForUser() throws Exception {
        // Arrange
        BudgetDto budget = new BudgetDto();
        budget.setBudgetID(1);
        budget.setCategory("Shopping");
        budget.setAmount(600);

        when(budgetDao.updateBudget(budget)).thenReturn(budget);

        // Act
        BudgetDto updatedBudget = budgetService.updateBudget(budget);

        // Assert
        assertNotNull(updatedBudget);
        assertEquals(Integer.valueOf(1), updatedBudget.getBudgetID());
        assertEquals("Shopping", updatedBudget.getCategory());
        assertEquals(Integer.valueOf(600), updatedBudget.getAmount());

        verify(budgetDao, times(1)).updateBudget(budget);

    }

    @Test
    public void testGetBudgetById() throws Exception {
        // Arrange
        int budgetId = 1;
        BudgetDto budget = new BudgetDto();
        budget.setBudgetID(budgetId);
        budget.setCategory("Gas");
        budget.setAmount(100);

        when(budgetDao.getBudgetById(budgetId)).thenReturn(budget);

        // Act
        BudgetDto retrievedBudget = budgetService.getBudgetById(budgetId);

        // Assert
        assertNotNull(retrievedBudget);
        assertEquals(Integer.valueOf(budgetId), retrievedBudget.getBudgetID());
        assertEquals("Gas", retrievedBudget.getCategory());
        assertEquals(Integer.valueOf(100), retrievedBudget.getAmount());

        verify(budgetDao, times(1)).getBudgetById(budgetId);
    }

    @Test
    public void testGetAllBudgets() throws Exception {
        // Arrange
        BudgetDto budget1 = new BudgetDto();
        budget1.setBudgetID(1);
        budget1.setCategory("Toys");
        budget1.setAmount(50);

        BudgetDto budget2 = new BudgetDto();
        budget2.setBudgetID(2);
        budget2.setCategory("Makeup");
        budget2.setAmount(100);

        List<BudgetDto> budgets = Arrays.asList(budget1, budget2);
        when(budgetDao.getAllBudgets()).thenReturn(budgets);

        // Act
        List<BudgetDto> retrievedBudgets = budgetService.getBudgets();

        // Assert
        assertNotNull(retrievedBudgets);
        assertEquals(2, retrievedBudgets.size());

        assertEquals("Toys", retrievedBudgets.get(0).getCategory());
        assertEquals(Integer.valueOf(50), retrievedBudgets.get(0).getAmount());

        assertEquals("Makeup", retrievedBudgets.get(1).getCategory());
        assertEquals(Integer.valueOf(100), retrievedBudgets.get(1).getAmount());

        verify(budgetDao, times(1)).getAllBudgets();
    }

}
