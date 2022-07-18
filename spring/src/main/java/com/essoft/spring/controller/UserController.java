package com.essoft.spring.controller;

import com.essoft.spring.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }

    @PostMapping("/users-all")
    public List<User> saveAllUser(@RequestBody List<User> users) {
        System.out.println("User saved!");
        users.forEach(user->user.setPassword(""));
        return users;
    }
}
