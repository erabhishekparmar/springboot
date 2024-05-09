package com.practice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.practice.dao.UserRepository;
import com.practice.entities.User;

public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 
		// fetching user from db
		
		User user = userRepository.getUserByName(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("Could not found user!!");
		}
		
		UserDetails customUserDetails = new UserDetailsImpl(user);
		
		return customUserDetails;
	}

}
