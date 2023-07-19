package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ListAssignment {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(40);
		list.add(70);
		list.add(70);
		list.add(10);
		list.add(15);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				
				if (list.get(i) == list.get(j)) {
					
					System.out.println(list.get(i));
					
					list.set(i, 0);
				}
				
			}
		}
		
		System.out.println(list);
		
		for (Integer integer : list) {
			
			if (integer != 0) {
				
				System.out.println(integer);
			}
		}
		
		
//		Collections.sort(list);
//		
//		int count = 0;
//
//		for (int i = 0; i < list.size(); i++) {
//			
//			for (int j = i+1; j < list.size(); j++) {
//				
//				if (i == count) {
//					
//					if (list.get(i) != list.get(j)) {
//						
//						System.out.println(list.get(i));
//						
//					}
//					
//					count++;
//				}
//				
//			}
//			
//		}
		
	}

}
