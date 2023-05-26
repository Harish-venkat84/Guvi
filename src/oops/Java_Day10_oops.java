package oops;

class Animal{
	
	String colour = "Black";
	
	void eat() {
		
		System.out.println("Pedigree");
	}
}

class Dog extends Animal {
	
	void breed() {
		
		System.out.println("Rottweiler");
	}
}

public class Java_Day10_oops extends Dog{

	void bark() {
		
		System.out.println("Bark");
	}
	
	public static void main(String[] args) {

		Java_Day10_oops dg = new Java_Day10_oops();
		
		System.out.println(dg.colour);
		
		dg.breed();
		
		dg.eat();
		
		dg.bark();
		
	}

}
