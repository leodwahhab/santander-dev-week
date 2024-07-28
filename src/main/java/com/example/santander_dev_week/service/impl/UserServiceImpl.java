package com.example.santander_dev_week.service.impl;

import com.example.santander_dev_week.model.BaseItem;
import com.example.santander_dev_week.model.User;
import com.example.santander_dev_week.repository.UserRepository;
import com.example.santander_dev_week.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsById(user.getId()))
            throw new IllegalArgumentException("This User ID already exists.");
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber()))
            throw new IllegalArgumentException(("This Account Number already exists."));
        return userRepository.save(user);
    }
}
