package com.actuators.helper;

import org.springframework.stereotype.Component;

@Component
public class Student {

	int rollno;
	String name;
	
	
	public Student() {
		System.out.println("creating student object");
	}
}
