package ExamplesDemo;

public class Child extends Parent {
	
	int x = 20;
	
	Child(){
	
		System.out.println("I am a child default constructor...");
	}
	
	Child(int x){
		//this(); //it goes to current class constructor
		System.out.println("I am a child param constructor...");
	}
	
	public void m1() {
		System.out.println("I am m1 in child..");
	}
	
	public void m2() {
		System.out.println("I am a m2 in child");
		System.out.println(super.x);
		super.m1();
	}
	
	public static void main(String[] args) {
		Child c = new Child(5);
		c.m2();

	}

}
