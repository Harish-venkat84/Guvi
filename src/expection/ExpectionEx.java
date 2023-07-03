package expection;

import java.io.IOException;

public class ExpectionEx {

	static void studentMark(int mark) {
		
		try {
		
			if (mark < 40) {
				
				throw new MarkValidation();
			
			}
			
		}catch (Exception e) {
		
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		studentMark(30);
		
	}
}

class MarkValidation extends Exception {

	private static final long serialVersionUID = 1L;

	MarkValidation() {
		
		System.out.println("Student mark should be greater than 40");
	}

	MarkValidation(String str) {
		
		System.out.println(str);
	}
}
