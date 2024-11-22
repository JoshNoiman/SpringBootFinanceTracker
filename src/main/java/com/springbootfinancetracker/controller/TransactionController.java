package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;


import com.springbootfinancetracker.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springbootfinancetracker.dto.TransactionDto;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {




    @GetMapping("/transaction")
    public List<TransactionDto> getAllTransactions() {
        return Arrays.asList(new TransactionDto());
    }

}
