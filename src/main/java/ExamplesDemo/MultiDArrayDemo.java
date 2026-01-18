package ExamplesDemo;

public class MultiDArrayDemo {

	public static void main(String[] args) {

		int arr[][] = { { 5, 3, 4 }, 
						{ 8, 5, 3 }, 
						{ 6, 9, 5, 7 } };

		// System.out.println(arr[2].length);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
