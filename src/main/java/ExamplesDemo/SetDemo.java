package ExamplesDemo;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		Set hs = new HashSet();

		hs.add(10);
		hs.add(15);
		hs.add(20);
		hs.add(25);

		for (Object o : hs) {
			System.out.println(o);
		}

		Iterator itr = hs.iterator();

		while (itr.hasNext()) {
			// Object x = itr.next();
			System.out.println(itr.next());

		}

	}

}