package oops;

import java.util.Arrays;

class ArrayToString {
	
	String ArraySting() {
		
		String[] subject = {"Maths", "Science", "English", "Social Science"};
		
		String join = String.join(" ", subject);
		
		return join;
	}
}

class StringIgnoreCase {
	
	boolean stringEqualIgnoreCase(String str1, String str2) {
		
		if (str1.equalsIgnoreCase(str2)) {
			
			return true;
		}
		
		return false;
	}
} 

class StringReverse{
	
	String reverse(String str) {
		
		var str2 = "";
		
		for (int i = str.length()-1; i >=  0; i--) {
			
			str2 = str2 + str.charAt(i);
		}
		
		return str2;
	}
}

class AnagramsString {
	
	boolean anagrams(String str, String str2) {
		
		str = str.toLowerCase();
		
		str2 = str2.toLowerCase();
		
		char[] charArray = str.toCharArray();
		
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		var count = 0;
		
		for (int i = 0; i < charArray2.length; i++) {
			
			if (charArray[i] != charArray2[i]) {
				
				count++;
			}
			
		}
		
		if (count == 0) {
			
			return true;
		}
		
		
		return false;
	} 
} 


class Stringoccurrence {
	
	String occurrence(String str, char Char) {
		
		String index = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == Char) {
				
				index = index + i +" ";
			}
		}
		
		return index;
	}
}

public class Java_Day13 {

	public static void main(String[] args) {
		
	ArrayToString obj = new ArrayToString();
	
	System.out.println(obj.ArraySting());
	
	StringIgnoreCase obj2 = new StringIgnoreCase();
	
	System.out.println(obj2.stringEqualIgnoreCase("JAVA", "java"));
	
	StringReverse obj3 = new StringReverse();
	
	System.out.println(obj3.reverse("java"));
	
	AnagramsString obj4 = new AnagramsString();
	
	System.out.println(obj4.anagrams("race", "care"));
	
	Stringoccurrence obj5 = new Stringoccurrence();
	
	System.out.println(obj5.occurrence("java", 'l'));
	
	String str = "45";
	
	int parseInt = Integer.parseInt(str);
	
	System.out.println(parseInt);
	
	}
	
}
