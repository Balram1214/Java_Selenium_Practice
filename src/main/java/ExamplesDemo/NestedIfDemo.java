package ExamplesDemo;

public class NestedIfDemo {

	public static void main(String[] args) {

		int age = 19;
		int weight = 45;

		if (age >= 18) {
			if (weight >= 50) {
				System.out.println("Person is eligible for blood donation");
			} else {
				System.out.println("Person is under weight : Not eligible");
			}
		} else {
			System.out.println("Person is under age : Not eligible");
		}

	}

}
