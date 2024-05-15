package java8;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		String name = "Abhishek";
		
		Optional<String> optional = Optional.ofNullable(name);
		
		System.out.println("isEmpty : "+optional.isEmpty());
		
		System.out.println("isPresent : "+optional.isPresent());
		
		System.out.println(optional.orElse("Not present"));
		
		// checking for null
		
		String Nullname = null;
		
		Optional<String> optional2  = Optional.ofNullable(Nullname);
		
		System.out.println("isEmpty : "+optional2.isEmpty());
		
		System.out.println("isPresent : "+optional2.isPresent());
		
		System.out.println(optional2.orElse("Not present"));
		
		
	}
}
