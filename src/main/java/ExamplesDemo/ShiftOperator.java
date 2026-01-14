package ExamplesDemo;

public class ShiftOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;

		// Left Shift a<<b = a * 2 ^ b

		System.out.println(a << b);
		System.out.println(20 << 3);

		// Right Shift a>>b = a / 2 ^ b

		System.out.println(a >> b);
		System.out.println(25 >> 3);

	}

}
