package ExamplesDemo;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Myname");
		StringBuilder sd = new StringBuilder("Mytest");
		
		System.out.println(sb.append(sd));
		
		System.out.println(sb.reverse());
		
		System.out.println(sd.insert(2, "Java"));
		
		System.out.println(sd);
		
		System.out.println(sd.replace(0, 6, "This is "));
		
		System.out.println(sd);
		System.out.println(sd.delete(5, 8));
	}

}
