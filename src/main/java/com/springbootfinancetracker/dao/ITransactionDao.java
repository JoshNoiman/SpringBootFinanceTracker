package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.TransactionDto;

public interface ITransactionDao {

    /**
     * 
     * @param integer to update transaction balance
     * @return none
     */
    void updateTransactionAmt(TransactionDto trans, int amt);

    /**
     * updates the category value.
     * @params TransactionDto transaction to update, and new category
     * @return True or False
     */
    boolean updateCategory(TransactionDto trans, String category);
}
