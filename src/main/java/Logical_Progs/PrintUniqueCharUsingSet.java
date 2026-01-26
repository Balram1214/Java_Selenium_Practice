package Logical_Progs;

import java.util.*;

public class PrintUniqueCharUsingSet {

	public static void main(String[] args) {
		String str = "laptop";
		Set st = new HashSet();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			st.add(ch);
		}
		System.out.println(st);

	}

}
