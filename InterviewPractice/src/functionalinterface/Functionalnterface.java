package functionalinterface;

public interface Functionalnterface {
	
	// SAM
	public String greet();
	
	// default
	default public String testDefaultMethod() {
		return "defaultMethodinInterface";
	}
	
	// static 
	static public String testStaticMethod() {
		return "staticMethod";
	}
}
