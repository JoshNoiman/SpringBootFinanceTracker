package com.springbootfinancetracker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SpringBootFinanceTrackerApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void addIncomeAndSubtractExpensesToGetNewValue() {
        getUserIncome();
        addUserIncome();
        calculateUserBalance();
        returnUsersNewBalance();
    }
    private void getUserIncome() {
        account = user.userId();
    }
    private void addUserIncome() {
        account.getIncome = account.getOldIncome() + account.getNewIncome();
    }
    private void calculateUserBalance() {
        account.balance = account.getIncome - account.expenses();
    }
    private void returnUsersNewBalance() {
        double newBalance = account.balance();
        double expectedBalance = 30.00;
        double delta = 0.001;
        assertEquals(expectedBalance, newBalance, delta);
    }


}
