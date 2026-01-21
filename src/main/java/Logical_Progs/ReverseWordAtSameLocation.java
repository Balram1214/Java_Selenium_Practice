package Logical_Progs;

public class ReverseWordAtSameLocation {

	public static void main(String[] args) {
		String str = "My name is Balraam";

		String output = "";

		String s[] = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			String w = s[i];
			String revW = "";

			for (int j = w.length() - 1; j >= 0; j--) {
				revW += w.charAt(j);
			}

			output += revW + " ";
		}

		System.out.println(output);

	}

}
