package ExamplesDemo;

import java.util.*;

public class UserInputDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String value: ");
		String str = sc.nextLine();

		System.out.println("Enter integer value: ");
		int n = sc.nextInt();

		System.out.println("Enter boolean value: ");
		boolean b = sc.hasNextBoolean();

		System.out.println("String value: " + str);
		System.out.println("Integer value: " + n);
		System.out.println("Boolean value: " + b);

	}

}
