package Collection;

import java.util.LinkedHashSet;

public class UniqueCharUsingSet {

	public static void main(String[] args) {
		String str = "tester";
		
		LinkedHashSet hs = new LinkedHashSet();
		
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			hs.add(c);
		}
		String output = "";
		for(Object o:hs) {
			output+=o;
		}
		
		System.out.println(output);

	}

}
