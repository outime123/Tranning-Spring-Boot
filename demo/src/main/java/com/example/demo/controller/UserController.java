package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserserviceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@EnableAutoConfiguration
@RequestMapping(method = RequestMethod.POST)

public class UserController {
    @Autowired
    UserserviceImp userserviceImp;


    @GetMapping("/login")
    public MyUserDetails login(@RequestBody MyUserDetails myUserDetails){
        return myUserDetails;
    }
    @GetMapping("/user")
    public List<User> getAllUser(){
        return (List<User>) userserviceImp.getAllUser();
    }

    @PostMapping("/create")
    public User save(@RequestBody User user){
         return userserviceImp.saveUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable (value = "id") int id){
        userserviceImp.deleteUser(id);
    }

    @PutMapping("/update")
    public User updateUser( @RequestBody User user){
        userserviceImp.updateUser(user);
        return user;
    }

    @PostMapping("/user/{id}")
    public User getUserById(@PathVariable (value = "id")int id){
        return userserviceImp.getUserById(id);
    }
}
