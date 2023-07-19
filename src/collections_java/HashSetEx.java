package collections_java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<Integer> sets = new HashSet<>(10, (float) 0.75);
		
		System.out.println(sets.size());

		HashSet<Integer> set = new HashSet<>();

		set.add(2);
		
		set.add(1);
		
		set.add(100);
		
		set.add(23);
		
		set.add(3);
		
		System.out.println(set);
		
		set.add(null);
		
		set.remove(null);
		
		System.out.println(set.size());
		
		System.out.println(set.contains(3));
		
		System.out.println(set.isEmpty());
		
		Object[] array = set.toArray();
		
		Iterator<Integer> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
	
	}

}
