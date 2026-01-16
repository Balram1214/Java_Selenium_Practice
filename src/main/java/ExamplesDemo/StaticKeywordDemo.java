package ExamplesDemo;

public class StaticKeywordDemo {

	static int a = 10;
	int b = 20;

	public static void main(String[] args) {

		StaticKeywordDemo obj = new StaticKeywordDemo();

		System.out.println(obj.b);
		obj.m2();

		System.out.println(a);
		m1();

	}

	public static void m1() {
		System.out.println("I am from m1");
	}

	public void m2() {
		System.out.println("I am from m2");
	}

}
