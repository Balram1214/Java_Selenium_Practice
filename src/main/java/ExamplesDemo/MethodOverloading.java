package ExamplesDemo;

import java.lang.reflect.Method;

public class MethodOverloading {

	MethodOverloading() {

	}

	MethodOverloading(int a) {

	}

	MethodOverloading(int a, int b) {

	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.addition(10, 20.5F);
		mo.addition(5, 10, 3);
		mo.subtraction(35, 5);
		mo.multiplication(2, 5);

	}

	public void addition(int a, int b) {
		System.out.println(a + b);

	}

	public void addition(int a, float b) {
		System.out.println(a + b);

	}

	public void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public void subtraction(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	public void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public void multiplication(int a, int b, int c) {
		System.out.println(a * b * c);
	}

}
