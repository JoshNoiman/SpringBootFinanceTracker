package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
import com.springbootfinancetracker.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 09e324caf95c428b9b8e4775d62e9172ec1c249c

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
