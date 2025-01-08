package com.carsaccesories.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsaccesories.model.User;
import com.carsaccesories.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to save a user
    public void saveUser(User user) {
        userRepository.save(user);
    }

    // Method to fetch a user by ID (if needed in the future)
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
