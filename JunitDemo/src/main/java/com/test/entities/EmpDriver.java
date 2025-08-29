package com.test.entities;

 

public class EmpDriver {
	public static void main(String[] args) {
		
		Emp e1 = Emp.createInstance();
		
		System.out.println(e1);
		
		Emp e2 = Emp.createInstance();
		
		System.out.println(e2);
		
		System.out.println(e1==e2);
	}
}
