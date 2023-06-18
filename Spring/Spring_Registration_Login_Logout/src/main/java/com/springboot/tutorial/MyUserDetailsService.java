package com.springboot.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springboot.tutorial.model.User;
import com.springboot.tutorial.repository.UserRepository;

public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User u = userRepo.findByEmail(username);
		if(u==null)
		{
			throw new UsernameNotFoundException("User not found");
		}
		return new MyUserDetails(u);
	}

}
