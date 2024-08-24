package com.prabha.restapp.service;

import java.util.List;

import com.prabha.restapp.model.User;

public interface UserService { 

	public User registerUser(User user); 

	public  User loginUser(String email, String password); 

	public  User getUserById(Long id);

	public List<User> getAllUsers(); 

} 