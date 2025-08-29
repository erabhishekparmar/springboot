package interfaceDemo;

public class InterfaceClassDemo {
	public static void main(String[] args) {
		InterfaceDemo interfaceDemo = new ClassDemo();
		
		interfaceDemo.show();
		
		interfaceDemo.defaultShow();
		
		InterfaceDemo.staticShow();
	}
}
