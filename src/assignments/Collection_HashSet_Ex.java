package assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection_HashSet_Ex {

	public static HashSet<String> set = new HashSet<>();

	public static void main(String[] args) {

		add(set, "red");

		add(set, "blue");

		add(set, "yellow");

		add(set, "black");

		iterator(set.iterator());
		
		System.out.println();

		System.out.println("Size of the set => "+size(set));

		System.out.println();
		
		System.out.println("set is empty => "+empty(set));

		System.out.println();
		
		HashSet<String> clone = clone(set);
		
		System.out.println("clone of the set => "+clone);
		
		System.out.println();
		
		Object[] array = toArray(set);
		
		for (Object string : array) {
			
			System.out.println(string);
		}
		
		TreeSet<String> treeSet = toTreeSet(set);
		
		System.out.println(treeSet);
		
		TreeSet<Integer> tree = new TreeSet<>();
		
		for (int i = 1; i <= 10; i++) {
			
			tree.add(i);
		}
		
		findNumber(tree);
		
	}

	public static void add(HashSet<String> ss, String str) {

		ss.add(str);
	}

	public static void iterator(Iterator<String> it) {

		while (it.hasNext()) {

			System.out.println(it.next());

		}
	}

	public static int size(HashSet<String> sets) {

		return sets.size();
	}

	public static boolean empty(HashSet<String> sets) {

		return sets.isEmpty();
	}

	public static HashSet<String> clone(HashSet<String> ss) {

		return ss = set;
	}

	public static Object[] toArray(HashSet<String> set2) {

		Object[] array2 = set2.toArray();
		
		return array2;
	}
	
	public static TreeSet<String> toTreeSet(HashSet<String> ss){
		
		TreeSet<String> tree = new TreeSet<>();
		
		tree.addAll(ss);
		
		return tree;
	}
	
	public static void findNumber(TreeSet<Integer> a) {
		
		a.stream().filter(m -> m < 7).forEach(System.out:: println);
		
		
	}

}
