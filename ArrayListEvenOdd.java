package Practice;

import java.util.ArrayList;

public class ArrayListEvenOdd {

	public static void main(String[] args) {
		int a[]= {12,13,15,11,34,24};
		ArrayList even=new ArrayList();
		ArrayList odd=new ArrayList();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even.add(a[i]);
			}
			else {
				odd.add(a[i]);
			}
		}
		System.out.println("even list: "+even);
		System.out.println("odd list:  "+odd);
		System.out.println(even.getFirst());
		System.out.println(even.getLast());
	}

}
