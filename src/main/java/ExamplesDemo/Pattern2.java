package ExamplesDemo;

public class Pattern2 {

	public static void main(String[] args) {
		// 1
		// 1 1
		// 1 1 1
		// 1 1 1 1
		// 1 1 1 1 1
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
	}

}
