package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserSevice {
    public Iterable<User> getAllUser();
    public User saveUser(User user);
    public void deleteUser(int idUser);
}
