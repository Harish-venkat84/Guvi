package assignments;

public class StringVaribaleEx {

	public static void main(String[] args) {

		String str1 = "Java";
		
		String str2 = "Language";
		
		str1 = str1.concat(str2);
		
		str2 = str1.substring(0, 4);
		
		str1 = str1.substring(4);
		
		System.out.println(str1 + " " + str2);
		
	}

}
