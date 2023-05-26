package guvi_java_class;

public class Java_Day7_Arrays {

	public static void main(String[] args) {
		
		int[] numbers = new int[101];
		
		for (int i = 0; i <= 100; i++) {
			
			numbers[i] = i;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i]);
			
		}
		

		int[] marks = {35, 45, 55, 65, 75, 85};
		
		for (int i = 0; i < marks.length; i++) {
			
			System.out.println(marks[i]);
		}
		
		int[][] num = new int[2][2];
		
		num[0][0] = 45;
		num[0][1] = 5;

		num[1][0] = 31;
		num[1][1] = 2;
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = 0; j < num.length; j++) {
				
				System.out.print(num[i][j] +" ");
			}
			
			System.out.println();
		}
		
		int[][] num2 = {{1,2}, {3,4}, {5,6}};
		
		boolean[] defaultBoolean = new boolean[1];
		float[] defaultFloat = new float[1];
		double[] defaultDouble = new double[1];
		short[] defaultShort = new short[1];
		long[] defaultLong = new long[1];
		char[] defaultChar = new char[1];
		byte[] defaultByte = new byte[1];
		
		for (int i = 0; i < defaultBoolean.length; i++) {
			
			System.out.println("Default value boolean ==> "+defaultBoolean[i]);
			System.out.println("Default value float ==> "+defaultFloat[i]);
			System.out.println("Default value double ==> "+defaultDouble[i]);
			System.out.println("Default value short ==> "+defaultShort[i]);
			System.out.println("Default value long ==> "+defaultLong[i]);
			System.out.println("Default value char ==> "+defaultChar[i]);
			System.out.println("Default value byte ==> "+defaultByte[i]);
			
		}
	}
	
	

}
