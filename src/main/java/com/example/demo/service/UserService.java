package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User getUser(String username);
    List<User> getUsers();

}
