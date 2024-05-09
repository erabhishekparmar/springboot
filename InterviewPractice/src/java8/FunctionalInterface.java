package java8;

public interface FunctionalInterface {

	// SAM  Single Abstract Method Interface
	public String test();
	
	
	  // default method in interface 
		default String justDefaultMethod() { 
			return "this is a default method in interface"; 
		}
	  
	  // static method in interface 
		static String justStaticMethod(){ 
			return "this is a static method in interface"; 
	}
	 
	
}
