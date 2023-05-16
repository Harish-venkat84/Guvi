package guvi_java_class;

public class Java_Day3 {

	public static void main(String[] args) {
		
		int i = 1;
		
//		while Loop
		
		while(i <= 10) {
			
			System.out.println(i);
			
			i++;
		}
		
		
		System.out.println();
		
//		do while loop
		
		i = 1;
		
		do {
			
			System.out.println(i);
			i++;
		
		}while(i <= 10);

		
//		for loop
	
		for (int j = 0; j < args.length; j++) {
			
			System.out.println(j);
			
		}
		
	}
	

}
