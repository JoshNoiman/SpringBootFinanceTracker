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
        // Act
        // Assert
    }


}
