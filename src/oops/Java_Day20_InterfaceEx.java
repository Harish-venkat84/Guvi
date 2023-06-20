package oops;

interface Bike1{
	
	static int a = 9;
	
	final static int bb = 0;
	
	void color();
	
	default void rpmBike() {
		
		System.out.println("Speed of the bike");
	}
	
	static void bikeName() {
		
		System.out.println("Name of the Bike");
	}
	
	
}

interface Car1{
	
	void color();
	
	default void rpmcar() {
		
		System.out.println("Speed of the car");
	}
	
	static void carName() {
		
		System.out.println("Name of the Car");
	}
}


class ObjectForBikeAndCar implements Bike1, Car1 {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String[] args) {
		
		ObjectForBikeAndCar obj = new ObjectForBikeAndCar();
		
		obj.color();
		
		Bike1.bikeName();
		
		Car1.carName();
	}

	
	
}


public interface Java_Day20_InterfaceEx {
	
	

}
