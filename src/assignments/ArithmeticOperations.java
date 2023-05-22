package assignments;

public class ArithmeticOperations {

	public int addition(int num1, int num2) {

		return num1 + num2;
	}

	public int subtraction(int num1, int num2) {

		return num1 - num2;
	}

	public int multiply(int num1, int num2) {

		return num1 * num2;
	}

	public int divide(int num1, int num2) {

		return num1 / num2;
	}

	public int modules(int num1, int num2) {

		return num1 % num2;
	}

	public static void main(String[] args) {
		
		ArithmeticOperations obj = new ArithmeticOperations();
		
		System.out.println(obj.addition(10,20));
		System.out.println(obj.subtraction(30,20));
		System.out.println(obj.multiply(10,20));
		System.out.println(obj.divide(20,5));
		System.out.println(obj.modules(50,5));
		
		
	}
	
}
