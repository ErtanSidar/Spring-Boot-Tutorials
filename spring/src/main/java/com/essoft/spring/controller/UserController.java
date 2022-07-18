package com.essoft.spring.controller;

import com.essoft.spring.dto.User;
import com.essoft.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

  /*  @PostMapping("/users")
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
    }*/
}
