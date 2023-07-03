package assignments;

import java.util.Scanner;

public class Assignments_3 {

	static Scanner scan = new Scanner(System.in);
	
	static void multiplication(int num) {

		for (int i = 1; i <= 20; i++) {

			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	static void starPattern(int num) {

		for (int i = num - 1; i >= 0; i--) {

			for (int j = i + 1; j <= num; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}

	static void reversedStar(int num) {
		
		for (int i = 0; i < num-1; i++) {

			for (int j = num-1; j > i; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}

			for (int j = i; j < num; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
		
		
	}
	
	static void nonrepeatingChar(String str) {
		
		str = str.toLowerCase();
		
		var str1 = new StringBuilder();
		
		str1.append(str);
		
		for (int i = 0; i < str1.length(); i++) {

			if (Character.isWhitespace(str1.charAt(i))) {

				str1.deleteCharAt(i);
			}
		}
		
		str = str1.toString();
		
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			for (int j = i+1; j < charArray.length; j++) {
				
				if (charArray[i] == charArray[j]) {
					
					charArray[j] = '0';
					
					char a = charArray[i];
					
					charArray[i] = '0';
					
					for (int k = j+1; k < charArray.length; k++) {
						
						if (a == charArray[k]) {
							
							charArray[k] = '0';
						}
					}
				}
			}
		}
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i] != '0') {
				
				System.out.print(charArray[i] + " ");
				
//				break;
			}
		}
	}

	public static void main(String[] args) { 
		
//		System.out.print("Enter your Multiplication number: ");
//		
//		multiplication(scan.nextInt());
//		
//		System.out.print("Enter No.of star: ");
//		
//		starPattern(5);

//		System.out.print("Enter No.of star: ");
//
		reversedStar(scan.nextInt());
		
//		System.out.print("enter the word: "); 
//		
//		nonrepeatingChar(scan.nextLine()); 
		

	}

}
