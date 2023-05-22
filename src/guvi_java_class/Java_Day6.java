package guvi_java_class;

public class Java_Day6 {
	
	
	int id = 0;
	
	String name = "";
	
	public Java_Day6(int id, String name){
		
		this.id = id;
		this.name = name;
		
		System.out.println("Today's topic about the constructor in java");
	}
	
	public void print() {
		
		System.out.println("id = "+id+" Name = "+name);
	}

	
	public static void main(String[] args) {
		
		Java_Day6 obj = new Java_Day6(10, "Nirmal");
		
		obj.print();
	}
}
