package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.TransactionDto;

import java.util.ArrayList;
import java.util.List;

public interface ITransactionService {

    /**
     *
     * @param amount
     * @param category
     * @return
     */
    TransactionDto addIncomeTransaction(double amount, String category);

    /**
     *
     * @param amount
     * @param category
     * @return
     */
    TransactionDto addExpenseTransaction(double amount, String category);

    /**
     *
     * @return
     */
    double getTotalIncome();

    /**
     *
     * @return
     */
    double getTotalExpense();

    /**
     *
     * @param category
     * @return
     */
    double getTotalByCategory(String category);


    /**
     *
     * @return
     */
    List<String> allCategories = new ArrayList<>();
}
