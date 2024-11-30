package com.springbootfinancetracker.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootfinancetracker.dto.UserDto;
import com.springbootfinancetracker.service.IUserService;

/**
 * User class contoller
 */
@RestController
public class UserController {
    @Autowired IUserService userService;
    /**
     * 
     * @return all users
     */
    @GetMapping("/user")
    public List<UserDto> fetchAllUsers() throws Exception {
        return userService.fetchAllUsers();
    }
    /**
     * 
     * @param id
     * @return specific user
     */
    @GetMapping("/user/{id}")
    public ResponseEntity fetchUserById(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }
    /**
     * 
     * @param user
     * @return newly created user
     */
    @PostMapping(value="/user", consumes="application/json", produces="application/json")
    public UserDto createUser(@RequestBody UserDto user) throws Exception{
        return userService.saveUser(user);
    }
    /**
     * 
     * @param id
     * @return removal of user
     */
    @DeleteMapping("/user/{id}/")
    public ResponseEntity deleteUser(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
