package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.TransactionDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class TransactionService implements ITransactionService {

    //@Autowired
    //private TransactionDao transactionDao

    /**
     * Creates a unique transaction ID associated with a transaction.
     *
     * @return generated transaction ID
     */
    @Override
    public int createTransactionId() {
        return 0;
    }

    /**
     * Adds income to transaction with specified category & amount.
     *
     * @param amount   The amount of income
     * @param category Category associated with amount
     * @return new income
     */
    @Override
    public TransactionDto addIncomeTransaction(double amount, String category) {
        return null;
    }

    /**
     * Adds expense to transaction with specified category & amount.
     *
     * @param amount   The amount of expense to subtract
     * @param category Category expense will be applied to
     * @return new expense
     */
    @Override
    public TransactionDto addExpenseTransaction(double amount, String category) {
        return null;
    }

    /**
     * Grabs total income associated with transaction.
     *
     * @return transaction's total income
     */
    @Override
    public double getTotalIncome() {
        return 0;
    }

    /**
     * Grabs total expense for transaction
     *
     * @return transactions total expense
     */
    @Override
    public double getTotalExpense() {
        return 0;
    }

    /**
     * Get total amount after income & expense calculation for transaction in a specific category
     *
     * @param category category to grab income & expense calculated value
     * @return total of category after income & expense
     */
    @Override
    public double getTotalByCategory(String category) {
        return 0;
    }

    /**
     * Grabs totals for each of the categories.
     *
     * @return a map of category names with their associated total amounts
     */
    @Override
    public Map<String, Double> getTotalsByCategory() {
        Map<String, Double> totals = new HashMap<>();
        for(String category : getAllCategories) {
            double total = getTotalByCategory(category);
            totals.put(category, total);
        }
        return totals;
    }
}
