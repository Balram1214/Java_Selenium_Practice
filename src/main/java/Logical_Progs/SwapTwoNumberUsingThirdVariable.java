package Logical_Progs;

public class SwapTwoNumberUsingThirdVariable {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;

		System.out.println("before swap " + a + " " + b);
		// using third variable
//		int temp = a;
//		a = b;
//		b = temp;

		// without third variable
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("after swap " + a + " " + b);

	}

}
