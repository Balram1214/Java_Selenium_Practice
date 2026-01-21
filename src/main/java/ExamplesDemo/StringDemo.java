package ExamplesDemo;

public class StringDemo {

	public static void main(String[] args) {

		String str = "3a2b1c";
		String output = "";

		for (int i = 0; i < str.length(); i += 2) {
			char ch = str.charAt(i);
			int n = Character.getNumericValue(ch);

			for (int j = 1; j <= n; j++) {
				output = output + str.charAt(i + 1);
			}
		}

		System.out.println(output);

	}

}
