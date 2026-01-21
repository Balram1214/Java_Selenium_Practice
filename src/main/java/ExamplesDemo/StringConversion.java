package ExamplesDemo;

public class StringConversion {

	public static void main(String[] args) {

		String s = "100";

		System.out.println(s + 100);

		int i = Integer.parseInt(s);
		// Float.parseFloat(s);
		// Double.parseDouble(s);
		// Boolean.parseBoolean(s);

		// Character.toString(s);

		System.out.println(i + 100);

		int a = 200;
		String str = String.valueOf(a);
		System.out.println(a + 300);
		System.out.println(str + 300);

	}

}
