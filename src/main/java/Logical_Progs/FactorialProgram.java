package Logical_Progs;

public class FactorialProgram {

	public static void fact(int n) {

		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact *= i;
		}
		System.out.println(fact);

	}

	public static void main(String[] args) {
		fact(5);
	}

}
