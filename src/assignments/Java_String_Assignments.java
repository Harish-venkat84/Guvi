package assignments;

class Palindrome {

	public String checkPalindrome(String pal) {

		String newPal = "";

		for (int i = pal.length() - 1; i >= 0; i--) {

			newPal = newPal + pal.charAt(i);
		}

		if (pal.equalsIgnoreCase(newPal)) {

			return "both are equal after revesing string ==> " + newPal;

		}

		return "Not Equal";
	}

}

public class Java_String_Assignments {
	
	public static void main(String[] args) {
		
		Palindrome obj = new Palindrome();
		
		System.out.println(obj.checkPalindrome("madam"));
		System.out.println(obj.checkPalindrome("Mom"));
		System.out.println(obj.checkPalindrome("tacocat"));
	}

}
