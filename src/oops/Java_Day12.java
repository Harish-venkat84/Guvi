package oops;

class Car {
	
	Car(){
		
		System.out.println("Tata");
	}
	
	String colour = "red";
	
	void print() {
		
		System.out.println("colour of the car is "+colour);
	}
}

class Bike extends Car{
	
// once we extends class, the parent class constructor will automatically called 	

	Bike(){
		
//		super();  for calling the parent class constructor we use this keyword (" super(); ")
		System.out.println("TVS");
	}
	
	String colour = super.colour;
	
	void print() {
		
		super.print();
		
		System.out.println("colour of the bike is "+ colour);
	}
}

public class Java_Day12 {
	
	public static void main(String[] args) {
		
		Bike obj = new Bike();
		
		obj.print();
	}

}
