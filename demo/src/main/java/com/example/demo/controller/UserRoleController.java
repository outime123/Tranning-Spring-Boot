package com.example.demo.controller;

import com.example.demo.entity.User_Role;
import com.example.demo.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRoleController {
    @Autowired
    UserRoleRepository userRoleRepository;

    @PostMapping("/userrole")
    public User_Role setRole(@RequestBody User_Role user_role){

       return userRoleRepository.save(user_role);
    }
}
