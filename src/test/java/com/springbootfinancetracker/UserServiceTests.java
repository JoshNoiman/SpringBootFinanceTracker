package com.springbootfinancetracker;

import com.springbootfinancetracker.dao.IUserDao;
import com.springbootfinancetracker.dao.UserDaoStub;
import com.springbootfinancetracker.dto.UserDto;
import com.springbootfinancetracker.service.UserServiceStub;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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
    public void testFetchAllUsers() throws Exception {
        // Arrange
        UserDto user1 = new UserDto();
        user1.setUserId(1);
        user1.setUsername("First User");
        user1.setPassword("First Password");

        UserDto user2 = new UserDto();
        user2.setUserId(2);
        user2.setUsername("Second User");
        user2.setPassword("Second Password");

        if(userDao instanceof UserDaoStub) {
            UserDaoStub userDaoStub = (UserDaoStub) userDao;
            userDaoStub.saveUserWithoutException(user1);
            userDaoStub.saveUserWithoutException(user2);
        }

        // Act
        List<UserDto> fetchedUsers = userService.fetchAllUsers();

        // Assert
        assertNotNull(fetchedUsers);
        assertEquals(2, fetchedUsers.size());
    }



}
