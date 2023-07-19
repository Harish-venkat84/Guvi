package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionFullAssignment {
	
	public static List<Integer> arrayToList(Integer[] array) {
		
		List<Integer> asList = Arrays.asList(array);
		
		return asList;
	}
	
	public static void shuffel(List<Object> al) {
		
		Collections.shuffle(al);
	}
	
	public static void mapValues(HashMap<Object, Object> map) {
		
		for (Map.Entry<Object, Object> entry : map.entrySet()) {

			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(val);
		}
	}
	
	public static void addToList(ArrayList<Object> al, ArrayList<Object> list) {
		
		al.addAll(list);
	}
	
	

}
