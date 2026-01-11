package ExamplesDemo;

public class Parent {
	int x = 10;
	
	
	Parent(){
		super();
		System.out.println("I am parent default constructor...");
	}
	
	Parent(int x){
		System.out.println("I am parent param constructor...");
	}
	public void m1() {
		System.out.println("I am in parent");
	}

}
