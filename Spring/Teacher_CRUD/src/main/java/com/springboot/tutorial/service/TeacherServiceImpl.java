package com.springboot.tutorial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.tutorial.model.Teacher;
import com.springboot.tutorial.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository teacherRepo;
	
	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepo.findAll();
	}

	@Override
	public void saveTeacher(Teacher t) {
		teacherRepo.save(t);
	}

	@Override
	public void deleteTeacher(Teacher t) {
		teacherRepo.delete(t);		
	}

	@Override
	public Optional<Teacher> getTeacherById(int id) {
		return teacherRepo.findById(id);
	}

	
	public Teacher login(String email, String password) {
		
		Teacher t = teacherRepo.findByEmailAndPassword(email, password);
		return t;
	}
	

	
		
	

}
