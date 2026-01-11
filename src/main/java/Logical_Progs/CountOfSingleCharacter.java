package Logical_Progs;

public class CountOfSingleCharacter {

	public static void main(String[] args) {
		String str = "balraam";

		char ch = 'a';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (ch == c) {
				count++;
			}
		}

		System.out.println("Count of " + ch + " is " + count);

	}

}
