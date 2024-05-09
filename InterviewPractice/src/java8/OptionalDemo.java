package java8;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		//String name = "Abhishek";
		String name = null;
		Optional<String> optional = Optional.ofNullable(name);
		
		System.out.println( optional.isEmpty());
		
		System.out.println(optional.orElse("Not present"));
	}
}
