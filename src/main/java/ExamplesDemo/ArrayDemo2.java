package ExamplesDemo;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int arr[] = new int[5];

		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		arr[3] = 25;
		arr[4] = 35;
		
		int arr2[] = {100, 250, 230, 456, 500}; // Declaration, Instant0iation and Initialization

//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		for (int a : arr) {
			System.out.println(a);
		}

	}

}
