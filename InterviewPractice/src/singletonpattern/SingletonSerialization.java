package singletonpattern;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {
	
	// Step 1 : private static instance 
	private static SingletonSerialization instance;
	
	// Step 2 : private constructor
	private SingletonSerialization() {
		
	}
	
	// Step 3 : static method to create and return single object
	public static SingletonSerialization getInstance() {
		if(instance == null)
			instance = new SingletonSerialization();
		return instance;
	}
	
}
