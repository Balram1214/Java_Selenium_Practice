package ExamplesDemo;

public class SampleJavaClass {
	
	int n = 10;

	public static void main(String[] args) {
		int a = 75;
		int b = 12;
		System.out.println(addition(a, b));
//		System.out.println(subtract(a, b));
//		System.out.println(division(a, b));
//		System.out.println(modulus(a, b));
		System.out.println(average(a, b));
		

	}
	
	public static int addition(int number1, int number2) {
		//System.out.println("Addition: ");
		int add = number1+number2;
		return add;
	}
	
	public static int subtract(int number1, int numbber2) {
		System.out.println("Subtraction");
		int sub = number1-numbber2;
		return sub;
	}
	
	public static float division(int number1, int number2) {
		System.out.println("Division");
		float div = number1/number2;
		return div;
	}
	
	public static int modulus(int number1, int number2) {
		System.out.println("Modulus");
		int mod = number1%number2;
		return mod;
	}
	
	public static float average(int x, int y) {
		System.out.println("Average");
		float f = addition(x, y);
		float avg = f/2; 
		return avg;
	}
	
	public static boolean checkNumber(int number) {
		System.out.println("Check Number: ");
		boolean flag = (number<100);
		return flag;
	}
	
	public static void printChar(char c) {
		System.out.println("Print Character");
		System.out.println(c);
	}

}
