package ExamplesDemo;

public class ClassInterfaceXY implements InterfaceX, InterfaceY {

	public static void main(String[] args) {
		ClassInterfaceXY ci = new ClassInterfaceXY();
		ci.foo();
		ci.run();
	}

	@Override
	public void run() {
		System.out.println("run method");

	}

	@Override
	public void foo() {
		System.out.println("foo method");

	}

}
