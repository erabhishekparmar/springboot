package com.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.practice.entities.User;

public interface UserRepository extends JpaRepository {

	@Query("select u from User u where u.email:=email")
	public User getUserByName(@Param("email") String email);
	
}
