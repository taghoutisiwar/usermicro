package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.entities.User;
import com.example.demo.service.UserService;

@SpringBootTest
class UsersMicroserviceApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void testAddUser() {
        User user = new User(null, "khalil", "1234", true, null);
        userService.saveUser(user);
        System.out.println(user);
    }

}
