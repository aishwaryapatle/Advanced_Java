package com.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.tutorial.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

	Teacher findByEmail(String email);
}
