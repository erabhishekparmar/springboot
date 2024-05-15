package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		// ordered but does not allow dups
		LinkedHashSet <Integer> set = new LinkedHashSet<>();
		
		set.add(2);
		set.add(0);
		set.add(3);
		set.add(3); // wont be added 
		set.add(1);
		set.add(1); // wont be added 
		
		System.out.println(set);
		
		System.out.println(set.size());
		
	}
	
}
