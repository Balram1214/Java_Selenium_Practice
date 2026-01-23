package Collection;

import ExamplesDemo.*;

public class ProtectedDemoChild extends ProtectedClassA {

	public static void main(String[] args) {
		ProtectedDemoChild pc = new ProtectedDemoChild();
		System.out.println(pc.n);
		pc.m1();
		// we can access protected member outside the package but using subclass

	}

}
