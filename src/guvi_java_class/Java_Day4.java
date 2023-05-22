package guvi_java_class;

public class Java_Day4 {

	public static void main(String[] args) {

//		break statement
		
		for (int i = 1; i <= 10; i++) {
			
			if (i <= 5) {
				
				System.out.println(i);
	
			}else {
				
				break;
			}
		}
		
		
//		continue statement
		
		for (int i = 1; i <= 10; i++) {
			
			if (i == 5) {
				
				continue;
				
			}else {
				
				System.out.println(i);
			}
		}
		
		
		int a = 0;
		
		while (a <= 10) {
			
			a++;
			
			if (a == 5) {
				
				continue;
			
			}else if (a == 8) {
				
				break;
			
			}else {
				
				System.out.println(a);
			}
			
		}
		
		int num = 987;
		
		String valueOf = String.valueOf(num);
		
		StringBuilder bul = new StringBuilder(valueOf);
		
		bul.reverse();
		
		int parseInt = Integer.parseInt(bul.toString());
		
		System.out.println(parseInt);
		
	}

}
