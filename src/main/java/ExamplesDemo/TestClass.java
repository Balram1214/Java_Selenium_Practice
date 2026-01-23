package ExamplesDemo;

public class TestClass {

	public static void main(String[] args) {

		ClassB cb = new ClassB();
		cb.m1();

		ClassA ca = new ClassB(); // upcasting
		ca.m1();

		ClassB ad = (ClassB) new ClassA(); // downcasting

	}

}
