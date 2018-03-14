package com.example.userapi.controller;

import com.example.userapi.datasource.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/user")
    String getUser() {
        return userRepository.getUser(2).toString();
    }
}
