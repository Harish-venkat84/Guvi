package assignments;

public class Java_String_Assignments {
	
	
	public String checkPalindrome(String pal) {
		
		char[] charArray = pal.toCharArray();
		
		String newPal = "";
		
		for (int i = charArray.length-1; i >= 0; i--) {
			
			newPal = newPal + charArray[i];
		}
		
		if (pal.equalsIgnoreCase(newPal)) {
			
			return "both are equal after revesing string ==> "+newPal;
		
		}
		
		
		return "Not Equal";
	}

}
