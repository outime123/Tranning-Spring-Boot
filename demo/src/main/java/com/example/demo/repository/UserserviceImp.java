package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImp implements UserSevice {
    @Autowired
    UserRepository userRepository;
    @Override
    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteUser(int idUser) {
        userRepository.deleteById(idUser);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public User getUserById(int id){
        return userRepository.getUserById(id);
    }
}
