package assignments;

public class Assignments_On_Day21 {
		
	public static void main(String[] args) { 
	
		
		StringReversing obj1 = new StringReversing("hello");
		
		System.out.println(obj1.reversingString());
		
	}
	
}

class StringReversing {
	
	String str;
	
	StringReversing(String str){
		
		this.str = str;
		
	}
	
	String reversingString() {
		
		String revers = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			revers = revers + str.charAt(i);
		}
		
		return revers;
	}
}
