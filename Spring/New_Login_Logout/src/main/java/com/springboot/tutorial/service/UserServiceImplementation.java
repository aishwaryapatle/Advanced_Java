package com.springboot.tutorial.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import com.springboot.tutorial.model.User;
import com.springboot.tutorial.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository db;
	
	
	@Override
	public List<User> getAllUsers() {
		return db.findAll();
	}

	@Override
	public void saveUser(User t) {
		db.save(t);		
	}

	@Override
	public void deleteUser(User t) {
		db.delete(t);
	}

	@Override
	public Optional<User> getUserById(int id) {
		return db.findById(id);
	}
	
	public User login(String email, String password) {
		User t = db.findByEmailAndPassword(email, password);
		return t;
	}

	@Override
	public User findUserByEmail(String email) {
        return db.findByEmail(email);
    }
	
	 @PersistenceContext
	    EntityManager entityManager;


	@Override
	public List<User> getUserEmail(String email) {
	        return db.findByEmail1(email);
//		return null;
	}

	    

}
