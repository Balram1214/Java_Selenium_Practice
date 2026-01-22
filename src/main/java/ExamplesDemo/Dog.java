package ExamplesDemo;

public class Dog extends Animal{
	
	void bark() {
		System.out.println("Barking...");
	}
	

	public static void main(String[] args) {
		
		Dog g = new Dog();
		g.eat();
		g.bark();
		
		Cat c = new Cat();
		c.eat();
		c.meaw();
		

	}

}
