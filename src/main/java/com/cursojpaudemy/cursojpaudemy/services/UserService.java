package com.cursojpaudemy.cursojpaudemy.services;

import com.cursojpaudemy.cursojpaudemy.entities.User;
import com.cursojpaudemy.cursojpaudemy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
