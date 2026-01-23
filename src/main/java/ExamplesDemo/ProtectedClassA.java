package ExamplesDemo;

public class ProtectedClassA {
	
	protected int n = 10;
	
	protected void m1() {
		System.out.println("ProtectedClassA m1 method");
		
	}

	public static void main(String[] args) {

		ProtectedClassA pc = new ProtectedClassA();
		System.out.println(pc.n);
		pc.m1();
		
	}

}
