package java8;

public class TestFunctionalInterface implements FunctionalInterface {

	@Override
	public String test() {
		return "Hi";
	}

	// overriding is possible & optional 
	@Override
	public String justDefaultMethod() {
		return "this is a default method in our class - overridden from Functional Interface";
	}
	
	// static method in our class
	public static String justStaticMethod(){	
		return "this is a static method in TestFunctionalInterface class - not overridden";
	}
		
	
	public static void main(String[] args) {
		
		FunctionalInterface fi = new TestFunctionalInterface();
		
		System.out.println(fi.test());
		
		System.out.println(fi.justDefaultMethod());
		
		System.out.println(FunctionalInterface.justStaticMethod());
		
		System.out.println(TestFunctionalInterface.justStaticMethod());
		
	}
	
	
}
