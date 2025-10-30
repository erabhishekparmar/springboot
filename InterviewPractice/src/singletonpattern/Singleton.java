package singletonpattern;

public class Singleton {
	
	// Step 1 : private static instance 
	private static Singleton instance;
	
	// Step 2 : private constructor
	private Singleton() {
		
	}
	
	// Step 3 : static method to create and return single object
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
}
