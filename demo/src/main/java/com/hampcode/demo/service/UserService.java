package com.hampcode.demo.service;

import com.hampcode.demo.entity.User;
import com.hampcode.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    // Services:
    // Get all users
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    // Create user
    public User createUser(User user)
    {
        // Validations
    }

}
