package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, Integer> mapNewMap = new HashMap<>();
		mapNewMap.put("One", 1);
		mapNewMap.put("Two", 2);
		mapNewMap.put("Three", 3);
		mapNewMap.put("Four", 4);
		mapNewMap.put(null, null);
		mapNewMap.put(null, null); // duplicate

		System.out.println("mapNewMap : " + mapNewMap);

		System.out.println("mapNewMap contains : Two :? " + mapNewMap.containsKey("Two"));

		Map<String, Integer> mapNewMap2 = new HashMap<>();
		mapNewMap2.put("Two", 2);
		mapNewMap2.put("One", 1);
		mapNewMap2.put("Three", 3);
		mapNewMap2.put("Four", 4);
		mapNewMap2.put(null, null);
		mapNewMap2.put(null, null); // duplicate

		System.out.println("Map 1 equals Map 2? " + mapNewMap.equals(mapNewMap2));
		
		System.out.println("value for key Two : " + mapNewMap.get("Two"));

		System.out.println("Four removed from Map 2?" + mapNewMap2.remove("Four"));

		System.out.println("Map 1 equals Map 2? " + mapNewMap.equals(mapNewMap2));

		System.out.println("Replacing One value in mapNewMap2? " + mapNewMap2.replace("One", 0));

		System.out.println("mapNewMap2 : " + mapNewMap2);

		System.out.println("Map 1 equals Map 2? " + mapNewMap.equals(mapNewMap2));

		mapNewMap2.clear();

		System.out.println("mapNewMap2 : " + mapNewMap2);

		// display the keys of mapNewMap
		Set<String> keySet = mapNewMap.keySet();
		System.out.println("keySet : " + keySet);

		// display values of mapNewMap
		Collection<Integer> valuesOfMap = mapNewMap.values();
		System.out.println("valuesOfMap : " + valuesOfMap);

		// display key and values both
		Set entySet = mapNewMap.entrySet();

		Iterator iterator = entySet.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> MapEntry = (Map.Entry) iterator.next();
			System.out.println("key : " + MapEntry.getKey() + ", value " + MapEntry.getValue());
		}

	}

}
