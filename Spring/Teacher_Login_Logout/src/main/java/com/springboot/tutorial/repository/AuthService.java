package com.springboot.tutorial.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.tutorial.model.Teacher;

@Service
public class AuthService {

	@Autowired
	private TeacherRepository teacherRepo;
	
	public boolean authenticate(String email, String password) {
		Teacher t = teacherRepo.findByEmail(email);
		if(t != null && t.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
