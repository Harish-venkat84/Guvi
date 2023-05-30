package oops;

class ASample {

	private int a = 10;

	private void privateMethod() {

		System.out.println(a);
	}

	int b = 20;

	void defaultMethod() {

		System.out.println(b);
	}

	protected String name1 = "Karan";

	protected void name() {

		System.out.println(name1);
	}

	public boolean d = true;

	public void pubname() {

		System.out.println(d);
	}

}

public class Java_Day11 {
	
	public ASample name3() {

		ASample a = new ASample();

		return a;
	}

	public static void main(String[] args) {

		ASample obj = new ASample();

		System.out.println(obj.b);

		obj.defaultMethod();

		System.out.println(obj.name1);

		obj.name();

		System.out.println(obj.d);

		obj.pubname();

	}

}
