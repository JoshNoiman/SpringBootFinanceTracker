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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



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
    @RequestMapping("/start.html")
    public String index() {
        return "start";
    }

    @RequestMapping("/budget.html")
    public String budget() {
        return "budget";
    }

    @RequestMapping("/error.html")
    public String error() {
        return "error";
    }

    @RequestMapping("/edit-profile.html")
    public String editProfile() {
        return "edit-profile";
    }

    @RequestMapping("/goal-tracker.html")
    public String goalTracker() {
        return "goal-tracker";
    }

    @RequestMapping("/income-expenses.html")
    public String incomeExpenses(Model model) {
        model.addAttribute("allCategories", transactionService.getAllCategories());
        model.addAttribute("transactions", transactionService.getTotalsByCategory());

        // TODO: replace 1 with transaction ID of most recent transaction
        model.addAttribute("transactionId", 1);
        return "income-expenses";
    }

    @RequestMapping("/Login.html")
    public String login() {
        return "login";
    }

    @RequestMapping("/User.html")
    public String User() {
        return "User";
    }

}
