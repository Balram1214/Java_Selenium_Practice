package ExamplesDemo;

public class StaticBlockDemo {

	{
		System.out.println("Block A"); // instance block will get executed when class instantiated
	}

	static {
		System.out.println("Static block"); // static block will execute before the main method
	}

	public static void m1() {
		System.out.println("I am from m1 method");
	}

	public static void main(String[] args) {

		System.out.println("Main method");

		// StaticBlockDemo ab = new StaticBlockDemo();
		// ab.m1();
		StaticBlockDemo.m1();

	}

}
