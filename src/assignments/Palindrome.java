package assignments;

public class Palindrome extends Java_String_Assignments {

	public static void main(String[] args) {

		Palindrome obj = new Palindrome();
		
		System.out.println(obj.checkPalindrome("madam"));
		System.out.println(obj.checkPalindrome("Mom"));
		System.out.println(obj.checkPalindrome("tacocat"));
		
		String str1 = "Java";
		
		String str2 = "Language";
		
		str1 = str1.concat(str2);
		
		str2 = str1.substring(0, 4);
		
		str1 = str1.substring(4);
		
		System.out.println(str1 + " " + str2);
		
	}

}
