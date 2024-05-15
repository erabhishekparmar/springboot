package interview;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		
		/*
		 * Map<Integer, String> map = new HashMap<>();
		 * 
		 * map.put(1,"One"); map.put(2,"Two"); map.put(3,"Three");
		 * 
		 * // access it Set set = map.entrySet();
		 * 
		 * Iterator it = set.iterator();
		 * 
		 * while(it.hasNext()) { Map.Entry<Integer, String> result =
		 * (Map.Entry)it.next();
		 * System.out.println(result.getKey()+", "+result.getValue()); map.put(4,
		 * "Four"); }
		 */
		
		// we can use concurrent HashMap
			
		Map<Integer, String> map = new ConcurrentHashMap<>();
		
		map.put(1,"One");
		map.put(2,"Two");
		map.put(3,"Three");
		
		// access it 
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> result = (Map.Entry)it.next();
			System.out.println(result.getKey()+", "+result.getValue());
			map.put(4, "Four"); // adding data while iterating over it
		}
		
		
		
	}
	
}
