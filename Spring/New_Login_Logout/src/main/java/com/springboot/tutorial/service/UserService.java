package com.springboot.tutorial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.springboot.tutorial.model.User;


public interface UserService {

	List <User> getAllUsers();
	void saveUser(User t);
	void deleteUser(User t);
	Optional <User> getUserById(int id);
	User findUserByEmail(String email);
    List<User> getUserEmail(String email);

}
