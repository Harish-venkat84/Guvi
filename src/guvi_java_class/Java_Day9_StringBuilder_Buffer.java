package guvi_java_class;

public class Java_Day9_StringBuilder_Buffer {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello");
		
		sb.append(" World ");
		
		sb.insert(0, "java");
		
		sb.delete(0, 4);
		
		sb.replace(6, 11, "java");
		
		String str = sb.substring(0, 5);
		
		sb.reverse();
		
		sb.reverse();
		
		int capacity = sb.capacity();
		
//		default value of string builder is 16. if it's above the default value then the default will change using this formula 
		
//		new capacity = (old capacity * 2) + 2 ===> (16 * 2) + 2 = 34  
		
//		System.out.println(capacity);
		
		System.out.println(sb);
		
		StringBuffer buf = new StringBuffer();
		
		
	}

}
