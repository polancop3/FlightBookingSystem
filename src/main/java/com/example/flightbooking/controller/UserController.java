package com.example.flightbooking.controller;

import com.example.flightbooking.model.User;
import com.example.flightbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserRepository userRepository;
    @PostMapping(path = "/user")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
