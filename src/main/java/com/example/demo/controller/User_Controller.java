package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.User_service;
@RestController
@RequestMapping("/user")
public class User_Controller {
@Autowired
private User_service serv;
@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAllUser(@RequestBody User user){
		List<User> get = serv.getAllUser(user);
		return ResponseEntity.ok().body(get);
		
	}
@PostMapping("/save")
public ResponseEntity<User> saveUser(@RequestBody  User user){
	User saving = serv.saveUser(user);
	 return ResponseEntity.ok().body(saving);
	
}

@PostMapping("/sav")
public ResponseEntity<User> saveEmployee(@RequestBody User student) {
	User emp = serv.saveUser(student);
	return ResponseEntity.ok().body(emp);
}

}
