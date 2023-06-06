package oops;

class ConName{
	
	int j;
	
	ConName(){
		
		j = 101;
		System.out.println("hello");
	}
	
	ConName(String name){
		
		this();
		
		System.out.println(name);
	}
}

public class Java_Day17 {
	
	public static void main(String[] args) {
		
		ConName co = new ConName("java");  // this only print the only the parameter constructor.
										   // until if we use (this - Keyword) in the parameter constructor
	}

}
