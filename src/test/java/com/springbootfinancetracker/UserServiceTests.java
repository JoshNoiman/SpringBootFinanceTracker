package com.springbootfinancetracker;

import com.springbootfinancetracker.dao.IUserDao;
import com.springbootfinancetracker.dto.UserDto;
import com.springbootfinancetracker.service.UserServiceStub;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Scope("session")
public class UserServiceTests {

    @Autowired
    private UserServiceStub userService;

    @Autowired
    private IUserDao userDao;

    @Test
    public void testFetchByUserIdAndReturnFirstUserIdContents() {
        // Arrange
        int userId = 1;

        // Act
        UserDto user = userService.fetchById(userId);

        // Assert
        assertNotNull(user);
        assertEquals(Integer.valueOf(1), user.getUserId());
        assertEquals("Joe Brave", user.getUsername());
        assertEquals("Pa$$w0rd", user.getPassword());

    }

    @Test
    public void testFetchAllUsers() {
        // Arrange

        // Act

        // Assert
    }



}
