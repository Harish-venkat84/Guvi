package guvi_java_class;

public class Java_Day8_Strings {

	public static void main(String[] args) {

		String str = "java";
		
		str = str.concat(" language");
		
		System.out.println(str);
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.contains("java"));
		
		System.out.println(str.equals("java language"));
		
		System.out.println(str.equalsIgnoreCase("Java Language"));
		
		System.out.println(str.hashCode());
		
		System.out.println(str.endsWith("language"));
		
		System.out.println(str.startsWith("java"));
		
		String str1 = " ";
		
		System.out.println(str1.isBlank());
		
		System.out.println(str1.isEmpty());
		
		System.out.println(str.contentEquals("java language"));
		
		System.out.println(str.indexOf("a"));
		
//		System.out.println(str.indent(1));
		
//		System.out.println(str.intern());
		
		System.out.println(str.lastIndexOf("a"));
		
		System.out.println(str.length());
		
		System.out.println(str.trim());
		
		
	}

}
