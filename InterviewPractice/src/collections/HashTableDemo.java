package collections;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String[] args) {
		Hashtable<Integer,String> table = new Hashtable<>();
		
		table.put(1,"One");
		table.put(2,"Two");
		table.put(3,"Three");
		//table.put(null,"Three"); // key and value cannot be null in hashtable
		table.put(3,"Four"); // value gets updated if key exists
		
		System.out.println(table);
		
	}
}
