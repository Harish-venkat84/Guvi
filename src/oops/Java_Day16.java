package oops;

class FinalMethod{
	
	final void finalmed() {
		
		System.out.println("final method");
	}
}

class Ex extends FinalMethod{
	
//	void finalmed() {  we can't override the final method on the sub class
//		
//	}
}

final class FinalClass{
	
	String name = "class";

}


//class FinalEx extends FinalClass {  we can't extend the final class

//	
//}

class SuperEx{
	
	int age = 10;
}


public class Java_Day16 extends SuperEx{
	
	final String month = "june";

	void mon() {
		
//		month = "July";   you can't change the final variables
	}
	
	public static void main(String[] args) {
		
		Java_Day16 ja = new Java_Day16();
		
		System.out.println(ja.age);
		
		
	}

}
