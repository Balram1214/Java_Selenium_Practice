package Collection;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		List li = new ArrayList();
		ArrayList ali = new ArrayList();

		li.add(10);
		li.add('B');
		li.add(true);
		li.add("Asus");

		System.out.println(li);

		System.out.println(li.get(2));

		System.out.println(li.size());

		System.out.println(ali.isEmpty());

		// To remove all elements from collection
		// li.clear();

		li.add(25);
		System.out.println(li);

		li.add(0, "Hello");
		System.out.println(li);

		ali.add(5);
		ali.add(7);
		System.out.println(ali);

		li.addAll(ali);
		System.out.println(li);

		ali.remove(1);
		System.out.println(ali);

		li.remove("Hello");
		System.out.println(li);

		System.out.println(li.indexOf(25));

		li.set(0, 100);
		System.out.println(li);

		li.add("true");
		System.out.println(li);
		li.remove("true");

		System.out.println(li);

		System.out.println("---------------------------------------------------------------------------------");

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("---------------------------------------------------------------------------------");

		for (Object x : li) {
			System.out.println(x);
		}
	}

}