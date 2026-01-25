package Logical_Progs;

import java.util.*;

public class UniqueCharFromStringList {

	public static void main(String[] args) {

		String str = "programmer";
		List li = new ArrayList();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String s = Character.toString(ch);

			if (!li.contains(s)) {
				li.add(s);
			}
		}
		System.out.println(li);
	}

}
