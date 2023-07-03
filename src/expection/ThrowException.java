package expection;

public class ThrowException {
	
	public static void main(String[] args) {

		ThrowExample.throwEx(10);

	}

}

class ThrowExample
{
	int age;
	
	static void throwEx(int age)
	{
		if(age <= 18)
		{
			//throw object or instance of the exceptionclass
			//throw new ArithmeticException
			throw new ArithmeticException("Age must be greater than 18");
		}
		else
		{
			System.out.println("Age is greater than 18");
		}
		
	}
	
}