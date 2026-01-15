package ExamplesDemo;

public class IfElseIfDemo {

	public static void main(String[] args) {

		int marks = 70;

		if (marks >= 90) {
			System.out.println("A Grad");

		} else if (marks >= 75 && marks < 90) {
			System.out.println("B Grad");
		} else if (marks >= 60 && marks < 75) {
			System.out.println("C Grad");
		} else {
			System.out.println("D Grad");
		}

	}

}
