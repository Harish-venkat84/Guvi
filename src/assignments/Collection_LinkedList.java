package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection_LinkedList {

	public static LinkedList<String> list = new LinkedList<>();

	public static void main(String[] args) {

		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("Yellow");
		list.addLast("Green");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println();

		for (int i = 0; i < list.size(); i++)
			System.out.println(i + " => " + list.get(i));

		System.out.println();

		for (int i = list.size() - 1; i >= 0; i--)
			System.out.println(list.get(i));

		System.out.println();

		list.add(0, "Grey");

		list.addFirst("Orange");
		list.addLast("Silver");

		System.out.println("getFirst => " + list.getFirst());

		System.out.println("getLast => " + list.getLast());

		list.removeFirst();

		list.removeLast();

		LinkedList<String> list2 = list;

		System.out.println(list2.getFirst());

		list2.removeFirst();

		list2.clear();

		Collections.shuffle(list);

		System.out.println(list.isEmpty());

		list.set(0, null);

	}

	public static void front(String str) {

		list.addFirst(str);
	}

	public static void end(String str) {

		list.addLast(str);
	}

	public static void specifiedPosition(int index, String str) {

		list.add(index, str);
	}

	public static void removeSpecified(String str) {

		list.remove(str);
	}

	public static void swap(String str, String str2) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equalsIgnoreCase(str)) {

				list.remove(i);

				list.addLast(str);

			} else if (list.get(i).equalsIgnoreCase(str2)) {

				list.remove(i);

				list.addLast(str2);
			}

		}
	}

	public static void addAndRemoveFirst(String str) {

		list.removeFirst();

		list.addFirst(str);
	}

	public static String retrieveFirst() {

		return list.getFirst();
	}

	public static String retrieveLast() {

		return list.getLast();
	}

	public static boolean elementExists(String str) {

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).equalsIgnoreCase(str)) {

				return true;
			}
		}

		return false;

	}

	public static ArrayList<String> linkedListTOArrayList() {

		ArrayList<String> al = new ArrayList<>();

		al.addAll(list);

		return al;
	}

	public static boolean compareList(List<String> al, List<String> al1) {

		int count = 0;

		if (al.size() == al1.size()) {

			for (int i = 0; i < al.size(); i++) {

				for (int j = 0; j < al1.size(); j++) {

					if (al.get(i).equalsIgnoreCase(al1.get(j))) {

						count++;
					}
				}
			}

		}
		
		if (count == al.size() - 1) {
			
			return true;
		
		}else {
			
			return false;
		}
	}

}
