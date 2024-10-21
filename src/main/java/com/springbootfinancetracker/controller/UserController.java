package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.UserDto;

@RestController
public class UserController {

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
