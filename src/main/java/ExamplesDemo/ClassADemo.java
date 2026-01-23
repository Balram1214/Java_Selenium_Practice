package ExamplesDemo;

public class ClassADemo implements InterfaceADemo {

	public static void main(String[] args) {
		InterfaceADemo id = new ClassADemo();
		id.m1();
		id.m2();
	}

	@Override
	public void m1() {
		System.out.println("Method m1");
	}

	@Override
	public void m2() {
		System.out.println("method m2");
	}

}
