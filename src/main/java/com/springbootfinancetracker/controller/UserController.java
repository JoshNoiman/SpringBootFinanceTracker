package com.springbootfinancetracker.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.UserDto;

@RestController
public class UserController {

    // @GetMapping("/user")
    // public List<UserDto> getAllUsers() {
    //     return Arrays.asList(new UserDto());
    // }

    // @PostMapping("/user")
    // public UserDto createUser(@RequestBody UserDto user) {
    //     System.out.println(user);
    //     return user;
    // }

}
