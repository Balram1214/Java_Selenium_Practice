package ExamplesDemo;

public class LogicalOperator {

	public static void main(String[] args) {
		// &&, ||, !
		
		int a = 10; 
		int b = 20;
		int c = 15;
		
		System.out.println(a<b && b>c); // T && T : true
		System.out.println(a>b && b>c); // F && T : false
		
		System.out.println(a>b || b>c); // F || T : true
		System.out.println(b<c || c<a); // F || F : false
		
		boolean bl = false;
		System.out.println(!bl);
		
		
		
		
		
		
		
		

	}

}
