package com.actuators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.actuators.helper.Student;

@SpringBootApplication
public class SpringActuatorsApplication {
	
	@Autowired
	Student student;

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorsApplication.class, args);
	}

}
