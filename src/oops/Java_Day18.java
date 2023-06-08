package oops;

class vehicalDetails {

//	int price;
//	
//	static String name;
//
//	void displayData() {
//
//		System.out.println(price + " " + name);
//	}
	
	int a;
	int b;
	
	{
	    this.a = 10;
	    
	    this.b = 2;
	    
	    System.out.println(a + b);
	}
	
	vehicalDetails() {

		this.a = 1;
		this.b = 2;
		
		System.out.println(a + b);
		
	}
	
	static int aa;
	static int bb;
	
	static {
		
		vehicalDetails.aa = 5;
		
		vehicalDetails.bb = 2;
		
		System.out.println(aa + bb);
	}
}

public class Java_Day18 {
	
	public static void main(String[] args) {

		vehicalDetails obj = new vehicalDetails();

//		obj.price = 90;
//
//		vehicalDetails.name = "java";
//
//		obj.displayData();
//
//		vehicalDetails obj1 = new vehicalDetails();
//
//		obj1.price = 100;
//
//		vehicalDetails.name = "jdk";
//
//		obj1.displayData();

	}

}
