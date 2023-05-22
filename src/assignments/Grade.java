package assignments;

public class Grade {
	
	String status = "";
	
	int mark = 0;
	
	String name = "";
	
	public void CheckPassOrFail(String name, int mark) {
		
		this.mark = mark;
		
		this.name = name;
		
		if (mark >= 40) {
			
			status = "pass";

		}else {
		
			status = "Fail";
			
		}
	}
	
	public void CheckGrade() {
		
		if (status.equalsIgnoreCase("pass")) {
			
			if (mark >= 85) {
				
				System.out.println("Name: "+name+" ==> Grade 'A'");
			
			}else if (mark >= 70 && mark < 85) {
				
				System.out.println("Name: "+name+" ==> Grade 'B'");
			
			}else if (mark >= 50 && mark < 70) {
				
				System.out.println("Name: "+name+" ==> Grade 'C'");
			
			}else if (mark >= 40 && mark < 50) {
				
				System.out.println("Name: "+name+" ==> Grade 'D'");
			}
		
		}else {
			
			System.out.println("Name: "+name+" Grade 'F'");
		}
	}
	
	public static void main(String[] args) {
		
		Grade obj = new Grade();
		
		obj.CheckPassOrFail("Karan", 85);
		
		obj.CheckGrade();
	}

}
