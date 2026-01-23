package ExamplesDemo;

public class Rectangle extends Shape {

	public static void main(String[] args) {
		Shape s = new Rectangle();
		s.draw();
		s.m1();

	}

	@Override
	void draw() {
		System.out.println("Drawing rectangle...");
	}

}
