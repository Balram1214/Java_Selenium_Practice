package ExamplesDemo;

public class BabyDog extends Dog {

	void weep() {
		System.out.println("Weep...");
	}

	public static void main(String[] args) {

		BabyDog bd = new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();
	}

}
