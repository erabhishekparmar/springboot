package interfaceDemo;

public interface InterfaceDemo {
	void show(); // abstract method
	
	// default method
	default void defaultShow() {
		System.out.println("Default method under InterfaceDemo");
	}
	
	// static method
	static void staticShow() {
		System.out.println("Static method under InterfaceDemo");
	}
}
