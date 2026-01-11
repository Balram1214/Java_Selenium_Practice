package Logical_Progs;

public class SortArrayAsce{

	public static void main(String[] args) {
		int a[] = {20, 40, 10, 5};

		int temp = a[0];
		for(int i=0; i<=a.length-1; i++) {
			for(int j = i+1; j<=a.length-1; j++) {
				if(a[i]>a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		for(int ar : a) {
			System.out.println(ar);
		}
	}

}
