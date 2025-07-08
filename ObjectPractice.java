package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectPractice {

	public static void main(String[] args) {
		/*Object a[]= {10,10.3,"welcome",'a',true};
		for(Object x:a) {
			System.out.println(x);
		}
		
		System.out.println(a[2]+"-"+a[0]);*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=sc.nextInt();
		String a[]= new String[n];
		System.out.println("enter the "+ n + " elements");
		for(int i=0;i<n;i++) {
			a[i] = sc.next();
		}
		
		System.out.println("Before sorting: " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting: " + Arrays.toString(a));

	}
}
