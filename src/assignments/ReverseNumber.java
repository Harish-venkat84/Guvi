package assignments;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 987;

		int reverse = 0;

		int remainder = 0;

		while (num != 0) {

			remainder = num % 10;

//			System.out.println(remainder);

			reverse = (reverse * 10) + remainder;

//			System.out.println(reverse);

			num = num / 10;

//			System.out.println(num);
		}

		System.out.println(reverse);
	}

}
