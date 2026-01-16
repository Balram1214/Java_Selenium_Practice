package ExamplesDemo;

public class StaticKeywordDemo2 {

	public static void main(String[] args) {
		StaticKeywordDemo ob = new StaticKeywordDemo();

		System.out.println(ob.a);
		ob.m1();

		System.out.println(StaticKeywordDemo.a);
		StaticKeywordDemo.m1();

	}

}
