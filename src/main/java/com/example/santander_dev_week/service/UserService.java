package com.example.santander_dev_week.service;

import com.example.santander_dev_week.model.User;
import com.example.santander_dev_week.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface UserService {
    User findById(Long id);

    User create(User user);
}