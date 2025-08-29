package com.test.entities;


public class Emp {

	int EmpNo;
	String empName;
	private static Emp emp ;
	
	private Emp() {
			System.out.println("calling privte constructor...");
		
	}
	
	public static Emp createInstance() {
		if(emp==null)
			emp = new Emp();
		return emp;
	}
	
	
	
}
