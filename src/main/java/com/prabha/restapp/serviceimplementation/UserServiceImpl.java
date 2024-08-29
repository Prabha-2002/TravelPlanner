package com.prabha.restapp.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabha.restapp.model.User;
import com.prabha.restapp.repo.UserRepository;
import com.prabha.restapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User loginUser(String email, String password) {
        return userRepository.findByEmail(email)
                             .filter(user -> user.getPassword().equals(password))
                             .orElse(null);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
