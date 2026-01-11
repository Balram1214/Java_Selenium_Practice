package Logical_Progs;

public class UniqueCharString {

	public static void main(String[] args) {
		String str = "testers";

		String output = "";
//
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			String s = Character.toString(ch);
//
//			if (!output.contains(s)) {
//				output += s;
//			}
//		}
//
//		System.out.println(output);
		
		// Using for each loop
		char ch[] = str.toCharArray();
		
		for(char c : ch) {
			String s = Character.toString(c);
			
			if(!output.contains(s)) {
				output+=s;
			}
		}
		System.out.println(output);

	}

}
