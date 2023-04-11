package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service @RequiredArgsConstructor @Transactional @Slf4j

public class UserController implements UserService {
    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to database ", user.getUserName());
        return userRepository.save(user);
    }

    @Override
    public User getUser(String username) {
        log.info("Fetching user  ");
        return userRepository.findByUserName(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users ");
        return userRepository.findAll();
    }
}