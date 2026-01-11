package Logical_Progs;

class numberPalindrome {
	public static void main(String args[]) {
		int input = 121;
		int output = 0;
		int number = input;
		
		while(number>0) {
			int rem = number%10;
			number = number/10;
			output = output*10+rem;
			
		}
		System.out.println(output);
		
		if(input == output) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}
			
		
	}
}