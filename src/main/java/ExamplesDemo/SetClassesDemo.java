package ExamplesDemo;

import java.util.*;

public class SetClassesDemo {

	public static void main(String[] args) {

		Set hs = new HashSet();

		hs.add('B');
		hs.add('A');
		hs.add('C');
		hs.add(200);
		hs.add('D');

		Set lhs = new LinkedHashSet();

		lhs.add('B');
		lhs.add('A');
		lhs.add('C');
		lhs.add(200);
		lhs.add('D');

		Set ts = new TreeSet();

		ts.add('B');
		ts.add('A');
		ts.add('C');
		ts.add('D');
		// ts.add(200); // We can store similar type of elements in TreeSet()
		// TreeSet Provides the elements in sorting order

		for (Object h : ts) {
			System.out.println(h);
		}

	}

}