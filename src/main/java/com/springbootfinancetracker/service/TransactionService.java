package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.CategoryDto;
import com.springbootfinancetracker.dto.TransactionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransactionService implements ITransactionService {

    // Current storage until DB implemented
    private static final List<CategoryDto> CATEGORIES = new ArrayList<>();
    private static final List<TransactionDto> TRANSACTIONS = new ArrayList<>();

    // TODO autoincrement ID and get current ID based on transactions held
    private int currentTransactionId = 0;

    // Fill categories
    static {
        CATEGORIES.add(new CategoryDto(1, "Groceries"));
        CATEGORIES.add(new CategoryDto(2, "Bills"));
        CATEGORIES.add(new CategoryDto(3, "Transportation"));
    }


    /**
     * Creates a unique transaction ID associated with a transaction.
     *
     * @return generated transaction ID (+1 previous ID)
     */
    @Override
    public int createTransactionId() {
        // Create new transaction ID;
        int previousId = currentTransactionId;
        int newId = previousId + 1;

        return newId;
    }

    /**
     * Save the transaction into the DB
     *
     * @param category the new transaction's associated category
     * @return newly made transaction
     */
    @Override
    public TransactionDto createTransaction(String category) {
        // Ensure category is valid
        if(category == null) {
            throw new IllegalArgumentException("Category invalid: " + category);
        }

        // Generate the new transaction
        TransactionDto transaction = new TransactionDto(
                createTransactionId(),
                "INCOME", // Currently default transaction type
                "New Transaction", // Default name of new transaction
                0.0, // Income amount
                0.0, // Expense amount
                0.0,  // Final amount made after calculations
                category
        );
        TRANSACTIONS.add(transaction);
        return transaction;
    }

    /**
     * Grab transaction by its associated ID
     *
     * @param id the desired transaction's ID to be grabbed
     * @return the transaction associated with the ID
     */
    @Override
    public TransactionDto getTransaction(int id) {
        for(TransactionDto transaction : TRANSACTIONS) {
            if(transaction.getTransactionID().equals(id)) {
                return transaction;
            }
        }

        throw new IllegalArgumentException("Transaction not found: " + id);
    }

    /**
     * Adds income to transaction with specified category & amount.
     *
     * @param transactionId the transaction to be changed
     * @param amount        The amount of income
     * @return new income
     */
    @Override
    public TransactionDto addIncomeTransaction(int transactionId, double amount) {
        TransactionDto transaction = getTransaction(transactionId);
        transaction.setAmount(transaction.getAmount() + amount);
        transaction.setCategroyIsIncomeOrExpense("INCOME");
        return transaction;
    }

    /**
     * Adds expense to transaction with specified category & amount.
     *
     * @param transactionId the transaction to be change
     * @param amount        The amount of expense to subtract
     * @return new expense
     */
    @Override
    public TransactionDto addExpenseTransaction(int transactionId, double amount) {
        TransactionDto transaction = getTransaction(transactionId);
        transaction.setAmount(transaction.getAmount() - amount);
        transaction.setCategroyIsIncomeOrExpense("EXPENSE");
        return transaction;
    }

    /**
     * Grabs total income associated with transaction.
     *
     * @param transactionId the transaction to grab
     * @return the transaction's total income
     */
    @Override
    public double getTotalIncome(int transactionId) {
        TransactionDto transaction = getTransaction(transactionId);

        // Check if INCOME transaction
        if("INCOME".equalsIgnoreCase(transaction.getCategroyIsIncomeOrExpense())) {
            return transaction.getAmount();
        }

        // Return 0 if not associated transaction type
        return 0.0;
    }

    /**
     * Grabs total expense for transaction
     *
     * @param transactionId the transaction to grab
     * @return transaction's total expense
     */
    @Override
    public double getTotalExpense(int transactionId) {
        TransactionDto transaction = getTransaction(transactionId);

        // Check if EXPENSE transaction
        if("EXPENSE".equalsIgnoreCase(transaction.getCategroyIsIncomeOrExpense())) {
            return transaction.getAmount();
        }

        // Return 0 if not associated transaction type
        return 0.0;
    }

    /**
     * Get total amount after income & expense calculation for transaction in a specific category
     *
     * @param category category to grab income & expense calculated value
     * @return total of category after income & expense
     */
    @Override
    public double getTotalByCategory(String category) {
        double total = 0;
        for(TransactionDto transaction : TRANSACTIONS) {
            if(transaction.getTransactionCategory().equals(category)) {
                total += transaction.getAmount();
            }
        }
        return total;
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

    /**
     * Updates retrieved transaction and edits income or expense by specified amount
     *
     * @param id      of transaction to be edited
     * @param income  of transaction to be added to or removed (holds double value)
     * @param expense of transaction to be added or removed (holds double value)
     */
    @Override
    public void updateTransaction(int id, Double income, Double expense) {
        for(TransactionDto transaction : TRANSACTIONS) {
            if(transaction.getTransactionID() == id) {

                if(income != null) {
                    transaction.setAmount(income);
                }

                if(expense != null) {
                    transaction.setAmount(expense);
                }

                return;
            }
        }
        throw new IllegalArgumentException("Transaction not found: " + id);
    }

    /**
     * Saves provided transaction into database
     *
     * @param transaction the transaction to be saved
     */
    @Override
    public void saveTransaction(TransactionDto transaction) {
        if(transaction != null) {
            // Assign ID if not already assigned one
            if(transaction.getTransactionID() == null) {
                transaction.setTransactionID(currentTransactionId + 1);
            }

            // add to or update the transaction in list
            boolean isUpdated = false;
            for(int transactionNumber = 0; transactionNumber < TRANSACTIONS.size(); transactionNumber++) {
                if(TRANSACTIONS.get(transactionNumber).getTransactionID().equals(transaction.getTransactionID())) {
                    TRANSACTIONS.set(transactionNumber, transaction);
                    isUpdated = true;
                    break;
                }
            }
            if(!isUpdated) {
                TRANSACTIONS.add(transaction);
            }
        }
    }

    /**
     * Retrieves all currently implemented categories specified.
     *
     * @return all category names
     */
     public List<String> getAllCategories() {
         List<String> categoryNames = new ArrayList<>();
         for(CategoryDto category : CATEGORIES) {
             categoryNames.add(category.getName());
         }
         return categoryNames;
     }

    /**
     * Retrieves all transactions
     *
     * @return all current transactions
     */
     public List<TransactionDto> getAllTransactions() {
         return TRANSACTIONS;
     }

}
