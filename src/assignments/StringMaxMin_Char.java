package assignments;

import java.util.ArrayList;
import java.util.Collections;

class StringEx1 {
}

public class StringMaxMin_Char {
	
	String str1 = "";

	public void stringMiniumChar() {

		String lowerCase = str1.toLowerCase();

		var str = new StringBuilder();

		str.append(lowerCase);

		for (int i = 0; i < str.length(); i++) {

			if (Character.isWhitespace(str.charAt(i))) {

				str.deleteCharAt(i);
			}
		}

		str1 = str.toString();

		char[] charArray = str1.toCharArray();

		String[] stringChar = new String[charArray.length];

		for (int i = 0; i < charArray.length; i++) {

			stringChar[i] = String.valueOf(charArray[i]);
		}

		for (int i = 0; i < stringChar.length; i++) {

			String empty = "";

			for (int j = i + 1; j < stringChar.length; j++) {

				if (stringChar[i] != null && stringChar[j] != null) {

					if (stringChar[i].equals(stringChar[j])) {

						empty = stringChar[i];

						stringChar[i] = null;
						stringChar[j] = null;

						for (int j2 = j; j2 < stringChar.length; j2++) {

							if (empty.equals(stringChar[j2])) {

								stringChar[j2] = null;
							}
						}
					}

				}

			}

		}

		System.out.print("The minium occurring character in a string is --> ");

		for (int j = 0; j < stringChar.length; j++) {

			if (stringChar[j] != null) {

				System.out.print(stringChar[j] + " ");

			}

		}

		System.out.println();
	}

	public void maximum() {

		var str = new StringBuilder();

		str.append(str1);

		for (int i = 0; i < str.length(); i++) {

			if (Character.isWhitespace(str.charAt(i))) {

				str.deleteCharAt(i);
			}
		}

		str1 = str.toString().toLowerCase();

		int[] count = new int[str1.length()];

		for (int i = 0; i < str.length(); i++) {

			count[i] = 1;

			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {

					count[i]++;
				}
			}
		}

		var list = new ArrayList<Integer>();
		
		for (int i : count) {
			
			list.add(i);
		}
		
		Integer max = Collections.max(list);

		var index = list.indexOf(max);
		
		System.out.println("The maximum occurring character in a string is --> " + str.charAt(index));

	}
	
	public StringMaxMin_Char(String str) {
		
		this.str1 = str;
	}

	public static void main(String[] args) {

		StringMaxMin_Char obj = new StringMaxMin_Char("Java Program to find maximum and minimum occurring character in a string");

		obj.stringMiniumChar();

		obj.maximum();

	}

}
