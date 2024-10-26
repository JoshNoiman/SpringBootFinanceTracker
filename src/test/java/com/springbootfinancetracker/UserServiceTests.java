package com.springbootfinancetracker;

import com.springbootfinancetracker.dao.IUserDao;
import com.springbootfinancetracker.dto.UserDto;
import com.springbootfinancetracker.service.IUserService;
import com.springbootfinancetracker.service.UserServiceStub;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Scope("session")
public class UserServiceTests {

    @Autowired
    private UserServiceStub userService;

    @Autowired
    private IUserDao userDao;

    @Test
    public void testFetchByUserIdAndReturnFirstId() {
        // Arrange
        int userId = 1;

        // Act

        // Assert
    }



}
