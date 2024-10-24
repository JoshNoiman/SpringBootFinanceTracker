package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.TransactionDto;

/**
 * Controller for handling transaction-related requests.
 */
@RestController
public class TransactionController {

    /**
     * Fetches all transactions.
     * @return the list of all transactions
     */
    @GetMapping("/transaction")
    public List<TransactionDto> getAllTransactions() {
        return Arrays.asList(new TransactionDto());
    }

    /**
     * Creates a new transaction.
     * @param transaction the transaction DTO
     * @return the created transaction DTO
     */
    @PostMapping("/transaction")
    public TransactionDto createTransaction(@RequestBody TransactionDto transaction) {
        System.out.println(transaction);
        return transaction;
    }

}
