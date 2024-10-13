package com.springbootfinancetracker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

    }
    private void addUserIncome() {}
    private void calculateUserBalance() {}
    private void returnUsersNewBalance() {}

}
