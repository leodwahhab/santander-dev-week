package com.example.santander_dev_week.service.impl;

import com.example.santander_dev_week.dto.UserDTO;
import com.example.santander_dev_week.model.User;
import com.example.santander_dev_week.repository.UserRepository;
import com.example.santander_dev_week.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return new UserDTO(user.getName(), user.getAccount(), user.getFeatures(), user.getCard(), user.getNews());
    }

    @Override
    public UserDTO create(UserDTO user) {
        if(userRepository.existsByAccountNumber(user.account().getNumber()))
            throw new IllegalArgumentException(("This Account Number already exists."));
        User userModel = new User();
        BeanUtils.copyProperties(user, userModel);
        userRepository.save(userModel);
        return user;
    }
}
