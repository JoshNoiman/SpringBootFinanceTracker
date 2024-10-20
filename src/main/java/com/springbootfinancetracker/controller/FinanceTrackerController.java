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

    @GetMapping("/user")
    public ResponseEntity fetchAllUsers() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity fetchUserById(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value="/user", consumes="application/jason", produces="application/jason")
    public UserDto createUser(@RequestBody UserDto user) {
        return user;
    }

    @DeleteMapping("/user/{id}/")
    public ResponseEntity deleteUser(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }
}
