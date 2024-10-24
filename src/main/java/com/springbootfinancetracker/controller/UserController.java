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
 * User controller for handling user-related requests.
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * Fetches all users.
     * @return the response entity with all users
     */
    @GetMapping("/user")
    public ResponseEntity<List<UserDto>> fetchAllUsers() {
        List<UserDto> users = userService.fetchAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    /**
     * Fetches a user by ID.
     * @param id the user ID
     * @return the response entity with the user
     */
    @GetMapping("/user/{id}")
    public ResponseEntity<UserDto> fetchUserById(@PathVariable("id") int id) {
        UserDto user = userService.fetchById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    /**
     * Creates a new user.
     * @param user the user DTO
     * @return the created user DTO
     */
    @PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {
        try {
            UserDto createdUser = userService.saveUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Deletes a user by ID.
     * @param id the user ID
     * @return the response entity
     */
    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {
        // Implement delete functionality
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
