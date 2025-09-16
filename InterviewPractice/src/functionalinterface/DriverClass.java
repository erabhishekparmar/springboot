package functionalinterface;

public class DriverClass implements Functionalnterface {

	@Override
	public String greet() {
		return "hello";
	}
	
	// default
	public String testDefaultMethod() {
			return "defaultMethodinDriver";
	}
	
	public static void main(String args[]) {
		Functionalnterface functionalInterface = new DriverClass();
		System.out.println(functionalInterface.greet());
		
		System.out.println(functionalInterface.testDefaultMethod());
		System.out.println(Functionalnterface.testStaticMethod());
	}
		
}
