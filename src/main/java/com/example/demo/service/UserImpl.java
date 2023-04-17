package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.naming.factory.SendMailFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service @RequiredArgsConstructor @Transactional @Slf4j

public class UserImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user {} to database ",
                user.getFirstname(),
                user.getLastname());
        return userRepository.save(user);
    }

    @Override
    public User getUser(String email) {
        log.info("Fetching user  ");
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users ");
        return userRepository.findAll();
    }
}