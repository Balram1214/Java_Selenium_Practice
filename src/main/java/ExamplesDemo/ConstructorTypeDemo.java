package ExamplesDemo;

public class ConstructorTypeDemo {
	
	
	ConstructorTypeDemo(){				// Default Constructor
		System.out.println("Default constructor: ");
	}
	
	ConstructorTypeDemo(int a){			// Parameterized Constructor
		System.out.println("Parameterized constructor: "+a);
	}

	// private ConstructorTypeDemo(int a, int b){ } // private constructor can't be instantiate
		
	
	public void foo() {
		System.out.println("I am from foo: ");
	}
	public static void main(String[] args) {

//		ConstructorTypeDemo ct = new ConstructorTypeDemo();
//		ct.foo();
		
		ConstructorTypeDemo ct1 = new ConstructorTypeDemo(10);
		ct1.foo();
		
		
	}

}
