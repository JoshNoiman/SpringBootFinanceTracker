package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.TransactionDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ITransactionService {

    /**
     * Creates a unique transaction ID associated with a transaction.
     * @return generated transaction ID
     */
    int createTransactionId();

    /**
     * Adds income to transaction with specified category & amount.
     *
     * @param amount The amount of income
     * @param category Category associated with amount
     * @return new income
     */
    TransactionDto addIncomeTransaction(double amount, String category);

    /**
     * Adds expense to transaction with specified category & amount.
     *
     * @param amount The amount of expense to subtract
     * @param category Category expense will be applied to
     * @return new expense
     */
    TransactionDto addExpenseTransaction(double amount, String category);

    /**
     * Grabs total income associated with transaction.
     *
     * @return transaction's total income
     */
    double getTotalIncome();

    /**
     * Grabs total expense for transaction
     *
     * @return transactions total expense
     */
    double getTotalExpense();

    /**
     * Get total amount after income & expense calculation for transaction in a specific category
     *
     * @param category category to grab income & expense calculated value
     * @return total of category after income & expense
     */
    double getTotalByCategory(String category);


    /**
     * Retrieves all currently implemented categories specified.
     *
     * @return all categories
     */
    List<String> allCategories = new ArrayList<>();

    /**
     * Grabs totals for each of the categories.
     *
     * @return a map of category names with their associated total amounts
     */
    Map<String, Double> getTotalsByCategory();
}
