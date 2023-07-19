package collections_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Java_Collections {

	public static void main(String[] args) {

		List<Object> al = new ArrayList<>();

		al.add('S');

		al.add("String");

		al.add(123);

		al.add(90.89);

		al.add(true);

		al.add(null);

		al.remove(null);

		System.out.println(al.contains(null));

		System.out.println(al.isEmpty());

		System.out.println(al);

		al.forEach(System.out::println);

		System.out.println(al.get(1));

		al.set(1, 'F');

		al.indexOf("String");

		Iterator<Object> iterator = al.iterator();

		while (iterator.hasNext()) {

			System.out.println("Inside the While --> " + iterator.next());
		}

		Java_ArrayList.addAll();

		Java_LinkedList.allList();

	}

}

class Java_ArrayList {

	public static void addAll() {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {

			list.add(i);
		}

		Collections.sort(list);

		System.out.println(list);

		Collections.reverse(list);

		System.out.println(list);

		Collections.shuffle(list);

		System.out.println(list);
	}

}

class Java_LinkedList {

	public static void allList() {

		LinkedList<Integer> list = new LinkedList<>();

		int i = 0;
		while (i <= 10) {

			list.add(i);

			i++;
		}

		list.addFirst(-1);
		
		list.addLast(11);
		
		System.out.println(list.get(4));
		
		System.out.println(list.getFirst());

		System.out.println(list.getLast());
		
		list.set(i - 1, null);

		list.remove(i - 1);

		list.remove(2);
		
		list.removeFirst();
		
		list.removeLast();
		
		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println(list);

		list.forEach(System.out::println);
		
//		int[] values = { 1, 2, 3, 4, 5, 6 };
		
//		List<Integer> asList = Arrays.stream(values).boxed().collect(Collectors.toList());

		Integer[] values = { 1, 2, 3, 4, 5, 6 };
		
		List<Integer> asList = Arrays.asList(values);
		
		System.out.println(asList);
		

	}
}
