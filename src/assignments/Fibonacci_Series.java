package assignments;

public class Fibonacci_Series {

	public static void main(String[] args) {


		int fiboNum = 5, num1 = 0, num2 = 1, num3 = 0, counter = 0;
		
		
		while(counter < fiboNum) {
			
			if (counter == 0) {
				
				System.out.print(num1+" "+num2+" ");
			}

			num3 = num2 + num1;
			
			num1 = num2;
			
			num2 = num3;
			
			counter++;
			
			
			System.out.print(num3+" ");
		}
		
	}

}
