package ExamplesDemo;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		int number = 10;

		switch (number) {
		case 10: {
			System.out.println("number is ten");
			//break;
		}
		case 20: {
			System.out.println("number is twenty");
			break;
		}
		case 30: {
			System.out.println("number is twenty");
			break;
		}

		default: {
			System.out.println("number is not 10, 20 or 30");
		}

		}

	}
}
