package com.springbootfinancetracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootfinancetracker.dto.UserDto;

@Controller
public class FinanceTrackerController {

    /**
     * Handle the root (/) endpoint and return a start page.
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "start";
    }

    @RequestMapping("/income-expenses.html")
    public String incomeAndExpenses() {
        return "income-expenses";
    }
    @RequestMapping("/budget.html")
    public String budget() {
        return "budget";
    }
}
