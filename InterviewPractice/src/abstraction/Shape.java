package abstraction;

public abstract class Shape {
	
	int x;
	
	// child's object will invoke this constructor
	Shape(int x){
		this.x = x;
	}
	
	public abstract void showShape(); // abstract method
	
	public void nonAbstract() {
		System.out.println("Non-abstract method under Shape");
	}
	
	// static method to provide utility
	public static void staticMethod() {
		System.out.println("Static method under Shape");
	}

}
