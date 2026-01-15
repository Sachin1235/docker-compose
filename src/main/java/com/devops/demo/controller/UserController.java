package com.devops.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.devops.demo.model.User;
import com.devops.demo.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
 @Autowired
 private UserRepository repo;

 @GetMapping
 public List<User> getUsers(){ return repo.findAll(); }

 @PostMapping
 public User addUser(@RequestBody User user){ return repo.save(user); }
}
