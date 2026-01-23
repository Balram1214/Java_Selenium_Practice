package ExamplesDemo;

public class Circle extends Shape {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		s.m1();

	}

	@Override
	void draw() {
		System.out.println("Drawing...");

	}

}
