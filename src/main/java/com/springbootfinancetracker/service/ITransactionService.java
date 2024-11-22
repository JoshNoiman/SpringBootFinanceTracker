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
     * Save the transaction into the DB
     *
     * @param category the new transaction's associated category
     * @return newly made transaction
     */
    TransactionDto createTransaction(String category);

    /**
     * Grab transaction by its associated ID
     *
     * @param id the desired transaction's ID to be grabbed
     * @return the transaction associated with the ID
     */
    TransactionDto getTransaction(int id);

    /**
     * Adds income to transaction with specified category & amount.
     *
     * @param transactionId the transaction to be changed
     * @param amount The amount of income
     * @return new income
     */
    TransactionDto addIncomeTransaction(int transactionId, double amount);

    /**
     * Adds expense to transaction with specified category & amount.
     *
     * @param transactionId the transaction to be change
     * @param amount The amount of expense to subtract
     * @return new expense
     */
    TransactionDto addExpenseTransaction(int transactionId, double amount);

    /**
     * Grabs total income associated with transaction.
     *
     * @param transactionId the transaction to grab
     * @return the transaction's total income
     */
    double getTotalIncome(int transactionId);

    /**
     * Grabs total expense for transaction
     *
     * @param transactionId the transaction to grab
     * @return transaction's total expense
     */
    double getTotalExpense(int transactionId);

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
    List<String> getAllCategories = new ArrayList<>();

    /**
     * Grabs totals for each of the categories.
     *
     * @return a map of category names with their associated total amounts
     */
    Map<String, Double> getTotalsByCategory();

    /**
     * Updates retrieved transaction and edits income or expense by specified amount
     *
     * @param id of transaction to be edited
     * @param income of transaction to be added to or removed (holds double value)
     * @param expense of transaction to be added or removed (holds double value)
     */
    void updateTransaction(int id, Double income, Double expense);

    /**
     * Saves provided transaction into the database
     *
     * @param transaction the transaction to be saved
     */
    void saveTransaction(TransactionDto transaction);
}
