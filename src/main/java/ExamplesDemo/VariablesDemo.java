package ExamplesDemo;

public class VariablesDemo {

	int n = 10; // class variable

	public static void main(String[] args) {
		VariablesDemo obj = new VariablesDemo();
		System.out.println(obj.n);

	}

	public void m1(int a) { // local variable
		System.out.println(a);
	}

	public void m2() {
		System.out.println("Hello from m2");
	}

}
