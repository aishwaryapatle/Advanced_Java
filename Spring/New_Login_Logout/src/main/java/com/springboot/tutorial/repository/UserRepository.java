package com.springboot.tutorial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.springboot.tutorial.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmailAndPassword(String email, String password);
	User findByEmail(String email);
	@Query(value = "SELECT * FROM user_tbl4 t WHERE t.email=?1", nativeQuery = true)
	List <User> findByEmail1(String email);
	

}
