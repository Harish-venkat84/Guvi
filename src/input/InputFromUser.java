package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Object> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		String next = scan.next();
		
		int nextInt = scan.nextInt();
		
		byte nextByte = scan.nextByte();
		
		boolean nextBoolean = scan.nextBoolean();
		
		double nextDouble = scan.nextDouble();
		
		float nextFloat = scan.nextFloat();
		
		long nextLong = scan.nextLong();
		
//		String nextLine = scan.nextLine();
//		
//		short nextShort = scan.nextShort();
		
		list.add(next);
		list.add(nextInt);
		list.add(nextByte);
		list.add(nextBoolean);
		list.add(nextDouble);
		list.add(nextFloat);
		list.add(nextLong);
//		list.add(nextLine);
//		list.add(nextShort);
		System.out.println(list);
		
		InputStreamReader in = new InputStreamReader(System.in);
		
		BufferedReader read = new BufferedReader(in);
		
		String line = read.readLine().toUpperCase();
		
		System.out.println(line);
		
	}

}
