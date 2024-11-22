package com.springbootfinancetracker.controller;

import com.springbootfinancetracker.dto.CategoryDto;
import com.springbootfinancetracker.dto.TransactionDto;
import com.springbootfinancetracker.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.context.Context;

import java.util.List;
import java.util.Map;


@Controller
public class FinanceTrackerController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private SpringTemplateEngine templateEngine;

    /**
     * Handle the root (/) endpoint and return a start page.
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "start";
    }

    /**
     * Handle /income-expense endpoint and return page with necessary data.
     *
     * @param model
     * @return income-expense page
     */
    @RequestMapping("/income-expenses")
    public String getIncomeExpenses(Model model) {
        model.addAttribute("allCategories", transactionService.getAllCategories());
        model.addAttribute("transactions", transactionService.getTotalsByCategory());

        // TODO: replace 1 with transaction ID of most recent transaction
        model.addAttribute("transactionId", 1);
        return "income-expenses";
    }



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

}
