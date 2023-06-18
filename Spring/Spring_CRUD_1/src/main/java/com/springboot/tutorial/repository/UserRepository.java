package com.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.tutorial.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
