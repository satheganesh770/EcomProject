package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface User_Repository extends JpaRepository<User,Integer> {

}
