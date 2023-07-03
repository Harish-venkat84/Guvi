package guvi_java_class;

public class Java_SwitchCase {

	public static void main(String[] args) {
		
//		java.io

		String day = "sat";

		String time = "";

		switch (day) {

			case "sun": 
				time = "7 am"; 
				break;
	
			case "sat", "fri": 
				time = "7 am"; 
				break;
	
			default: 
				time = "6 am";
		}

		time = switch (day) {
	
			case "sun" -> "7 am";
	
			case "sat", "fri" -> "8 am";
	
			default -> "6 am";

		};

		time = switch (day) {

			case "sun" : yield "7 am";
	
			case "sat", "fri": yield "8 am";
	
			default: yield "6 am";

		};

		System.out.println(time);

	}

}
