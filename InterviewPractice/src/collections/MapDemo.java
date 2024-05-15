package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

public static void main(String[] args) {
	
	Map<String,Integer> map = new HashMap<>();
	
	map.put("One", 1);
	map.put("Three", 3);
	map.put("Two", 2);
	
	Set<String> keys = map.keySet();
	
	System.out.println(keys);
	
	Iterator it = keys.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	Collection<Integer> values = map.values();
	
	Iterator it2 = values.iterator();
	
	while(it2.hasNext()) {
		System.out.println(it2.next());
	}

	Set keyValue = map.entrySet();
	
	Iterator it3 = keyValue.iterator();
	
	while(it3.hasNext()) {
		
		Map.Entry<String,Integer> et = (Map.Entry)it3.next();
		System.out.println(et.getKey()+", "+et.getValue());
		
	}
	
}
	
}
