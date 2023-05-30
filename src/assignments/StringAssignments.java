package assignments;

import oops.Java_Day10_oops;

//import java.util.Scanner;

public class StringAssignments extends Java_Day10_oops {
	
	
	public static String[] strArray = new String[100];
	
	public String[] stringToArray(String input) {

		for (int i = 0; i < strArray.length; i++) {
			
			if (strArray[i] == null) {
				
				strArray[i] = input;
				
				break;
			}
		}

		return strArray;
	}

	public void removeChar(String input, int num) {

//		try (Scanner scan = new Scanner(System.in)) {
//			
//			System.out.println("please enter the index of the String character which you have to remove");
//			
//			num = scan.nextInt();
//			
//		}catch (Exception e) {
//
//		}
		
		String removed = "";

		for (int i = 0; i < input.length(); i++) {

			if (i != num) {

				removed = removed + input.charAt(i);
			}
		}

		System.out.println("After removing the character from the string ==> "+removed);
		
	}

//	How do you count the number of words in String

	public void countWords(String input) {

		String[] split = input.split(" ");

		System.out.println("Total number of words you have entered ==> " + split.length);
	}

//	Java program to find the duplicate characters in a string

	public void duplicate(String input) {

		int count = -1;

		String lowerCase = input.toLowerCase();

		String[] duplicateArray = new String[input.length()];
		
		char[] charArray = lowerCase.toCharArray();
		
		String[] stringChar = new String[charArray.length];

		for (int i = 0; i < charArray.length; i++) {
			
			stringChar[i] = String.valueOf(charArray[i]); 
		}
		
		for (int i = 0; i < stringChar.length; i++) {

			for (int j = i + 1; j < stringChar.length; j++) {

				if (stringChar[i].equals(stringChar[j])) {

					duplicateArray[++count] = stringChar[i];

					stringChar[i] = String.valueOf(count);

					duplicateArray[++count] = stringChar[j];

					stringChar[j] = String.valueOf(count);

					for (int j2 = 0; j2 < stringChar.length; j2++) {

						if (duplicateArray[count].equals(stringChar[j2])) {

							duplicateArray[++count] = stringChar[j2];

							stringChar[j2] = String.valueOf(count);
						}
					}
				}
			}
		}

		for (String c : duplicateArray) {

			if (c != null) {
				
				System.out.print(c+" ");
			}
			
		}

		count++;
		System.out.println("(Total count ==> " + count+")");
	}

	public static void main(String[] args) {

		StringAssignments obj = new StringAssignments();
		
		obj.stringToArray("java");
		obj.stringToArray("world");
		String[] stringToArray = obj.stringToArray("hello");
		
		for (String string : stringToArray) {
			
			if (string != null) {
				
				System.out.println(string);
			}
			
		}

		System.out.println("---------------------------");
		
		obj.removeChar("java", 1);

		System.out.println("---------------------------");
		
		obj.countWords("How do you count the number of words in String");

		System.out.println("---------------------------");
		
		obj.duplicate("Hello World Java");
		
		
//		https://codeshare.io/9O6n1M
		
	}

}
