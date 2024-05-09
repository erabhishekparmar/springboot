package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name,String city);
	
	public List<User> findByNameStartingWith(String name);
	
	@Query("Select u from User u")
	public List<User> getAllUsers();
	
	@Query("Select u from User u where u.name=:n and u.city=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c")String city);
	
	@Query(value="Select * from user",nativeQuery=true)
	public List<User> getUsers();
	
}
