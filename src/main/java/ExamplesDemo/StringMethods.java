package ExamplesDemo;

public class StringMethods {

	public static void main(String[] args) {

		String str1 = "Name";
		String str2 = "name";
		String str3 = "";
		String str4 = " ";
		String str5 = " Balram ";
		String str6 = "Balram R Rajale";
		//String str7 = "iambalram";

		System.out.println(str2.toUpperCase());
		System.out.println(str1.toLowerCase());

		System.out.println(str3.isEmpty());
		System.out.println(str4.isBlank());
		System.out.println(str1.length());
		System.out.println(str1.concat("is Balram"));
		System.out.println(str1 + str4 + "is" + str4 + "Asus");

		System.out.println(str2.charAt(1));
		System.out.println(str1.charAt(str1.length() - 1));

		System.out.println(str1.startsWith("na"));
		System.out.println(str2.endsWith("me"));

		System.out.println(str2.contains("am"));
		System.out.println(str1.replace("Name", "Balraam"));

		System.out.println(str1);

		System.out.println(str5.trim());
		
		System.out.println(str1.indexOf('m'));
		System.out.println(str5.lastIndexOf('a'));

		char ch[] = str6.toCharArray();
		for (char c : ch) {
			System.out.print(c);
		}

		System.out.println("--------------------------------------------------------");

		String s[] = str6.split(" ");
		for (String sr : s) {
			System.out.println(sr);
		}
		
		String name = "Hello, I am Balram";
		System.out.println(name.substring(7));
		System.out.println(name.substring(0, 13));
		
		

	}

}
