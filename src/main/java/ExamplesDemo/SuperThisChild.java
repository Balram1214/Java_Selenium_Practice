package ExamplesDemo;

public class SuperThisChild extends SuperThisParent {

	int x = 20;

	public SuperThisChild() {
		System.out.println("Default child constructor");

	}

	void m1() {
		System.out.println("m1 method in child");
	}

	public void display() {
		System.out.println(x);
		m1();

		System.out.println(this.x);
		this.m1();

		System.out.println(super.x);
		super.m1();

	}

	public static void main(String[] args) {
		SuperThisChild sc = new SuperThisChild();
		sc.display();

	}

}
