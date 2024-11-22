package com.springbootfinancetracker.dao;

import com.springbootfinancetracker.dto.TransactionDto;
import com.springbootfinancetracker.dao.ITransactionDao;

public class ITransactionDaoStub implements ITransactionDao {

    @Override
    public void updateTransactionAmt(TransactionDto trans, Double amt) {
        trans.setAmount(amt);
    }

    @Override
    public boolean updateCategory(TransactionDto trans, String category) {
        if(category.equalsIgnoreCase("Income")) {
            trans.setCategoryIsIncomeOrExpense("Income");
            return true;
        }
        if(category.equalsIgnoreCase("Expense")) {
            trans.setCategoryIsIncomeOrExpense("Expense");
            return true;
        }
        return false;
    }
    
}
