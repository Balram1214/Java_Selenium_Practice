package Logical_Progs;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21 34 55

		int n1 = 1;
		int n2 = 1;
		System.out.print(n1 + " " + n2);

		for (int i = 3; i <= 10; i++) {
			int n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
