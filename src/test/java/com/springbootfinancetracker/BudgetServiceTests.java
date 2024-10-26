package com.springbootfinancetracker;

import com.springbootfinancetracker.dao.IBudgetDao;
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
        // Act
        // Assert

    }

}
