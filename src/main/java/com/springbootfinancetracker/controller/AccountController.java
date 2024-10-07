package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.AccountDto;

@RestController
public class AccountController{

    @GetMapping("/account")
    public List<AccountDto> getAllAccounts() {
        return Arrays.asList(new AccountDto());
    }

    @PostMapping("/account")
    public AccountDto createAccountDto(@RequestBody AccountDto account) {
        System.out.println(account);
        return account;
    }
}