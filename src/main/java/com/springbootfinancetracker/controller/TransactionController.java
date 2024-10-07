package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.TransactionDto;

@RestController
public class TransactionController {

    @GetMapping("/transaction")
    public List<TransactionDto> getAllTransactions() {
        return Arrays.asList(new TransactionDto());
    }

    @PostMapping("/transaction")
    public TransactionDto createTransaction(@RequestBody TransactionDto transaction) {
        System.out.println(transaction);
        return transaction;
    }

}
