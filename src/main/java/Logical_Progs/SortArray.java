package Logical_Progs;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 4, 3, 9 };

		// Arrays.sort(arr); // using array's method

		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) { // using nested for loop
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		for (int a : arr) {
			System.out.print(a+" ");
		}

	}

}
