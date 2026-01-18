package Logical_Progs;

public class MissingNoArray {

	public static void main(String[] args) {

		int aray[] = { 1, 2, 3, 4, 6 };

		int sum = 0;

		for (int i = 0; i < aray.length; i++) {
			sum += aray[i];
		}

		int expSum = 0;

		for (int j = 1; j <= 6; j++) {
			expSum += j;
		}

		System.out.println("Mising Number is : " + (expSum - sum));

	}

}
