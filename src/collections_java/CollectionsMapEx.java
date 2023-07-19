package collections_java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsMapEx {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 10);
		map.put(2, 10);
		map.put(3, 10);
		map.put(4, 10);
		
		Set<Integer> keySet = map.keySet();
		
		Collection<Integer> values = map.values();
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			
		}
		
		
	}

}
