package Collection;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		
		ArrayList li = new ArrayList();
		
		li.add(1);						// add the elements into array list
		li.add("name");
		li.add('B');
		li.add(true);
		
		System.out.println(li.size()); //number of elements in array list
		
		System.out.println(li);
		
		li.add(1, "Balram");		//add the element at specific index
		
		System.out.println(li);
		
		Object o = li.get(2);		//get the element at given index
		System.out.println(o);
		
		//li.clear();
		//System.out.println(li);     // delete all data from array list
		
		System.out.println(li.contains(true));  //check the object is present or not in array list and give boolean output
		
		System.out.println(li.isEmpty()); 		//check array list is empty or not
		
		System.out.println(li.indexOf("Balram")); // get index of given element
		
		System.out.println(li.lastIndexOf('B')); // returns the index of the last occurance of the specified elements in this list
		
		

	}

}
