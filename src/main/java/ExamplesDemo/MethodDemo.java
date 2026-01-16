package ExamplesDemo;

public class MethodDemo {

	public static void main(String[] args) {
		sum(10, 20);

		System.out.println(mult(2, 3, 4));

	}

	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static int mult(int a, int b, int c) {
		return a * b * c;
	}

}
