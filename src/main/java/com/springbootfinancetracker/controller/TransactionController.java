package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;


import com.springbootfinancetracker.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
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

    @Autowired
    TransactionService transactionService;

    @PostMapping("/submit-transaction")
    public String submitTransaction(
            @RequestParam("category") String category,
            @RequestParam(value = "incomeAmount", required = false) String incomeStr,
            @RequestParam(value = "expenseAmount", required = false) String expenseStr,
            Model model) {

        // Parse incomeAmount into a type of double
        Double incomeAmount = null;
        if (incomeStr != null && !incomeStr.isEmpty()) {
            incomeAmount = Double.parseDouble(incomeStr);
        }

        // Parse expenseAmount into a type of double
        Double expenseAmount = null;
        if (expenseStr != null && !expenseStr.isEmpty()) {
            expenseAmount = Double.parseDouble(expenseStr);
        }

        // Create the new transaction
        TransactionDto transaction = transactionService.createTransaction(category);

        // Set the amounts for income
        // TODO: Show the final amount after accounting income and expenses
        transaction.setIncomeAmount(incomeAmount);
        transaction.setExpenseAmount(expenseAmount);

        Double newTotalAmount = transaction.getIncomeAmount() - transaction.getExpenseAmount();
        transaction.setAmount(newTotalAmount);

        // Save transaction
        transactionService.saveTransaction(transaction);

        // Add necessary data into the model
        model.addAttribute("transactions", transactionService.getAllTransactions());
        model.addAttribute("allCategories", transactionService.getAllCategories());

        // Return same view but re-rendered with updated data
        return "income-expenses";

    }

    /**
     *
     *
     * @param id
     * @return
     */
    @GetMapping("/edit-transaction/{id}")
    public ResponseEntity<TransactionDto> getTransactionById(@PathVariable int id) {
        TransactionDto editedTransaction = transactionService.getTransaction(id);
        return ResponseEntity.ok(editedTransaction);
    }

    @GetMapping("/transaction")
    public List<TransactionDto> getAllTransactions() {
        return Arrays.asList(new TransactionDto());
    }

}
