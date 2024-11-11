package com.springbootfinancetracker.service;

import com.springbootfinancetracker.dto.TransactionDto;

import java.util.List;

public interface ITransactionService {
    TransactionDto addTransaction(TransactionDto transactionDto);
    List<TransactionDto> getAllTransactions();
    TransactionDto getTransactionById(int id);
    TransactionDto updateTransaction(int id, TransactionDto transactionDto);
    void deleteTransaction(int id);
    List<String> allCategories = List.of();
}
