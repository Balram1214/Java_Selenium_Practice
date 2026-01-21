package ExamplesDemo;

public class StringComparison {

	public static void main(String[] args) {

		String str1 = "Name";
		String str2 = "Name";
		String str3 = "name";
		String str4 = "Test";
		String str5 = new String("Name");
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str5));
		
		System.out.println(str2.equalsIgnoreCase(str3));
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str5);
		
		// compareTo(): check the value dictonary wise, content + casing (Based on ASCII Code)
		// output: number format
		// if two string are same then output will be 0
		// if two string are not same then output will be the difference
		
		String s1 = "abc";
		String s2 = "ABC";
		String s3 = "abc";
		String s4 = "xyz";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		
	}

}
