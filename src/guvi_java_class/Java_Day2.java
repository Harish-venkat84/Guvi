package guvi_java_class;

public class Java_Day2 {

	public static void main(String[] args) {

		int c = 10;

		int d = 20;

		if (c > d) {

			System.out.println("A is Greater than B");

		} else if (c > d) {

			System.out.println("B is Greater than A");

		} else {

			System.out.println("A and B are equal");
		}

		int a = 50, b = 6;

		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));

		int num1 = 20, num2 = 20;

		System.out.println(num1 + " > " + num2 + " ==> " + (num1 > num2));
		System.out.println(num1 + " < " + num2 + " ==> " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " ==> " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " ==> " + (num1 <= num2));
		System.out.println(num1 + " == " + num2 + " ==> " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " ==> " + (num1 != num2));

		int num3 = 10, num4 = 25, num5 = 20;

		boolean value = true;

		System.out.println(!value);

		if (num3 > num4 && num4 > num5) {

			System.out.println("if Block");

		} else if (num3 > num4 || num3 > num4) {

			System.out.println("if else Block");

		}

	}

}
