package Logical_Progs;

import java.util.Arrays;

public class RemoveNonZeroDuplicate {

	public static void main(String[] args) {
		int n = 951007405;
		System.out.println(n);
		
		// remove zero & duplicate
		// sort number in ascending 

		String strInt = Integer.toString(n);
		
		String nonZero = strInt.replace("0", ""); //remove zero
		System.out.println(nonZero);

		String unique = "";
		for(int i=0; i<nonZero.length(); i++) {
			char ch = nonZero.charAt(i); // fetch character one by one
			String str = Character.toString(ch); // char to String
			
			if(!unique.contains(str)) {
				unique+=str;               // add unique char
			}
		}
		
		System.out.println(unique);
		
		char arr[] = unique.toCharArray();  // String to Char Array
		Arrays.sort(arr);
		
		String output = new String(arr); // array to String 
		
		int intOut = Integer.parseInt(output); // Stringt to Integer
		
		System.out.println(intOut);
	}

}
