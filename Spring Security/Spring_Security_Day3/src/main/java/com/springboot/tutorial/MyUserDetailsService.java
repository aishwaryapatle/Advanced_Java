package com.springboot.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.tutorial.model.User;
import com.springboot.tutorial.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User u = repo.findByUname(username);
		if(u==null)
		{
			throw new UsernameNotFoundException("User Not Found!");
		}
		return new UserDetailsImplements(u);
	}

}
