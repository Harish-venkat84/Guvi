package oops;

// abstract class can have both abstract and non abstract methods
// then we can't create object for an abstract class because is have unimplemented methods

abstract class Java {

	static abstract class B {

		abstract void someMethod();
	}

	abstract void hello();
	
	static int a = 0;
	
	static final int bb = 0;
	
	static void mane() {
		
	}

	public void javaHello() {

	}

}

abstract class Hello extends Java {
	
	static int a = 2;
	
	void fianljava() {
		
		a = this.a;
	}
}

public class Java_Day19_Abstract extends Java {

	@Override
	void hello() {

		System.out.println("abstract method");
	}

	static B j = new B() {

		@Override
		void someMethod() {

			System.out.println("static class");

		}
	};

	public static void main(String[] args) {

		Java_Day19_Abstract ab = new Java_Day19_Abstract();

		ab.hello();

		j.someMethod();
	}

}
