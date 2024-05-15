package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List <Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(0);
		list.add(5);
		list.add(2);
		
		System.out.println(list); // 1 0 5 2
		
		System.out.println(list.size()); // 4
		 
		System.out.println(list.isEmpty()); // false
		
		Collections.sort(list); 
		
		System.out.println(list);  // 0 1 2 5
		
		list.clear();
		
		System.out.println(list); // []
		
		
	}
	
}
