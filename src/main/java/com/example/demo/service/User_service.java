package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public interface User_service {
public List<User> getAllUser(User user);
public User saveUser(User user);
	

}
