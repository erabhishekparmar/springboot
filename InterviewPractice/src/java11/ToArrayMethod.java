package java11;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("Abhishek","Kapil","Sandeep"); // collection : array list
		
		// convert list to an array of String
		Object [] objects = list.toArray(); 
		
		// type safe
		String[] stringArray = list.toArray(new String[0]); // by passing the argument we are telling the type of array to be created 
		
		System.out.println(stringArray);
		
		
		
		// integer list to array
		
		List<Integer> listOfIntegers = Arrays.asList(3,5,6,67,7); // collection : array list
		
		Object objectOfInteger = listOfIntegers.toArray();
		Integer[] integerArray = listOfIntegers.toArray(Integer[]::new);
		
		System.out.println(integerArray);
	}
}
