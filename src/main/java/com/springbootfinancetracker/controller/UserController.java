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
import org.springframework.stereotype.Service;
import java.util.List;

import com.springbootfinancetracker.dto.UserDto;

/**
 * User class service
 */
@Service
public class UserService {

    public List<UserDto> getAllUsers() {
        // Placeholder for fetching all users, e.g., from a database
        return List.of(new UserDto("1", "John Doe"), new UserDto("2", "Jane Doe"));
    }

    public UserDto getUserById(String id) {
        // Placeholder for fetching a user by ID
        return new UserDto(id, "Sample User");
    }

    public UserDto createUser(UserDto user) {
        // Placeholder for creating a new user
        return user;
    }

    public boolean deleteUserById(String id) {
        // Placeholder for deleting a user by ID
        return true;
    }
}

/**
 * User class contoller
 */
@RestController
public class UserController {
    
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<List<UserDto>> fetchAllUsers() {
       List<UserDto> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    /**
     * 
     * @param id
     * @return specific user
     */
    @GetMapping("/user/{id}")
     public ResponseEntity<UserDto> fetchUserById(@PathVariable("id") String id) {
        UserDto user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    /**
     * 
     * @param user
     * @return newly created user
     */
    @PostMapping(value="/user", consumes="application/jason", produces="application/jason")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {
        UserDto createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
    /**
     * 
     * @param id
     * @return removal of user
     */
    @DeleteMapping("/user/{id}/")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") String id) {
        boolean isDeleted = userService.deleteUserById(id);
        return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : 
        new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
