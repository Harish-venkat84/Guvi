package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection_ArrayListEx {
	
	public static void main(String[] args) {
	
		ListEx();
	}

	public static void ListEx() {
		
		ArrayList<String> list = new ArrayList<>(20);
		
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("Yellow");
		
		System.out.println(list);
		
		System.out.println("======== iterate through all elements ============");
		
		Iterator<String> iterator = list.iterator();	
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		System.out.println("========= insert an element first position =============");
		
		list.add(0, "Gold");
		
		System.out.println(list);
		
		System.out.println("=========== specified index ==============");
		
		System.out.println(list.get(1));
		
		System.out.println("============ update an array ===============");
		
		list.set(2, "Green");
		
		System.out.println(list);
		
		System.out.println("========= remove the third element ============");
		
		list.remove(3);
		
		System.out.println(list);
		
		System.out.println("========= search for an element ===========");

		System.out.println(list.contains("Green"));
		
		System.out.println("======= sort ========");
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("===== copy one array list into another ========");
		
		ArrayList<String> list2 = list;
		
		System.out.println(list2);
		
		System.out.println("====== shuffle elements =============");
		
		Collections.shuffle(list);
		
		System.out.println(list);
		
		System.out.println("======= reverse elements ============");
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		System.out.println("======= extract a portion ============");
		
		System.out.println(list.indexOf("Green"));
		
		System.out.println("=========== compare two array lists ===========");
		
		System.out.println(list.containsAll(list2));
		
		System.out.println("========= swaps two elements ==========");
		
		String str;
		
		int count = list.size()-1;
		
		for (int i = 0; i < list.size(); i++) {
			
			if (i == 0 || i == 1) {
				
				str = list.get(0);
				
				list.remove(0);
				
				list.add(count, str);
				
//				count -= 2;
			}
			
		}
		
		System.out.println(list);
		
		
		System.out.println("======== join two array lists ==========");
		
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();
		
		int a = 0;
		
		while(a <= 10) {
			
			if (a <= 5) {
				
				al.add(a);
			
			}else {
				
				al2.add(a);
			}
			
			a++;
		}
		
		al.addAll(al2);
		
		System.out.println(al);
		
		System.out.println("========= empty an array list ===========");
		
		al.clear();
		
		System.out.println(al);
		
		System.out.println("====== list is empty or not =======");
		
		System.out.println(al.isEmpty());
		
		System.out.println("======= trimming the capacity =========");
		
		list.trimToSize();

		System.out.println(list.size());
		
		System.out.println("======= increase an array list size =======");
		
		ArrayList<Integer> al3 = new ArrayList<>(1);
		
		for (int i = 0; i <= 10; i++) {
			
			al3.add(i);
			
			al3.ensureCapacity(al3.size()+1);
		}
		
		System.out.println(al3);
		
		System.out.println("=========== replace the second element ===========");
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).equalsIgnoreCase("Green")) {
			
				list.set(i, "Brown");
			}
			
		}
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
	}
	
}
