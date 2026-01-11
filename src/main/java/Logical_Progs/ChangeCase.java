package Logical_Progs;

public class ChangeCase {

	public static void main(String[] args) {
		String input = "HelLo1@23";

		String output = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (Character.isAlphabetic(c)) {
				String x = "";

				if (Character.isUpperCase(c)) {
					x = Character.toString(c).toLowerCase();
				} else {
					x = Character.toString(c).toUpperCase();
				}
				output += x;
			} else {
				output += c;
			}
		}
		
		System.out.println(output);

	}

}
