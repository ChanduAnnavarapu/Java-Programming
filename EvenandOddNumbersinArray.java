package Practice;

import java.util.Scanner;

public class EvenandOddNumbersinArray {

	public static void main(String[] args) {
		int a[]= {2,5,6,3,11,43,78,900,546,2354};
		String even="";
		String odd="";
		/*for(int i=0;i<a.length-1;i++) {
			if(a[i]%2==0) {
				even=even+" "+a[i];
			}
			else {
				odd=odd+" "+a[i];
			}
		}*/
		
		//using enhanced for loop
		for(int value:a) {
			if(value%2==0) {
				even=even+" "+value;
			}
			else {
				odd=odd+" "+value;
			}
		}
		System.out.println("even numbers:"+even);
		System.out.println("odd numbers:"+odd);
	}
}
