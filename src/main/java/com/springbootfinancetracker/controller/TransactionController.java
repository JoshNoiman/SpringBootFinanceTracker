package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import com.springbootfinancetracker.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springbootfinancetracker.dto.TransactionDto;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

//    private final TransactionService transactionService;
//
//    public TransactionController(TransactionService transactionService) {
//        this.transactionService = transactionService;
//    }

//    @PostMapping
//    public ResponseEntity<String> createTransaction(@RequestBody TransactionDto transaction) {
//        // Save the transaction
//        transactionService.addIncomeTransaction(transaction);
//        transaction.
//    }

    @GetMapping("/transaction")
    public List<TransactionDto> getAllTransactions() {
        return Arrays.asList(new TransactionDto());
    }

}
