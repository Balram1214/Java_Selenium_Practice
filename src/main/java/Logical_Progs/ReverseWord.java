package Logical_Progs;

public class ReverseWord {

	public static void main(String[] args) {
		String input = "My name is Balraam";

		String str[] = input.split(" ");

		String output = "";

		for (int i = str.length - 1; i >= 0; i--) {
			output += str[i];
		}

		System.out.println(output);

	}

}
