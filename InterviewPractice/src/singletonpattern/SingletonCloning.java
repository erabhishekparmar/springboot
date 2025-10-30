package singletonpattern;

public class SingletonCloning implements Cloneable {
	
	// Step 1 : private static instance 
	private static SingletonCloning instance;
	
	// Step 2 : private constructor
	private SingletonCloning() {
		
	}
	
	// Step 3 : static method to create and return single object
	public static SingletonCloning getInstance() {
		if(instance == null)
			instance = new SingletonCloning();
		return instance;
	}
	
	// override to create new object 
	@Override
	protected Object clone() throws CloneNotSupportedException {
	    return super.clone(); // return new one
	}
	
	
}
