package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.User_Repository;
import com.example.demo.model.User;

public class Service_impl implements User_service {
@Autowired
private User_Repository repo;
	@Override
	public List<User> getAllUser(User user) {
		
		return repo.findAll();
	}
	@Override
	public User saveUser(User user) {
		
		return repo.save(user);
	}

}
