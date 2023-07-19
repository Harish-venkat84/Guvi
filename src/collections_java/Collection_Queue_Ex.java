package collections_java;

import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_Queue_Ex {

	public static Queue<Integer> aa = new PriorityQueue<>();
	
	public static void main(String[] args) {
		
		aa.add(10);
		
		aa.offer(100);
		
		aa.add(50);
		
		aa.offer(20);
		
		aa.add(10);
		
		aa.add(20);
		
		System.out.println(aa.element());
		
		System.out.println(aa.peek());
		
		System.out.println(aa);

		aa.remove();
		
		aa.poll();
		
	}
	
}
