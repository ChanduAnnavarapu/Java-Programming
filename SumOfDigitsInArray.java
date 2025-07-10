package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDigitsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of values: ");
		int n=sc.nextInt();
		int a[]=new int[n],sum=0;
		System.out.println("enter the array elements: ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of a["+i+"]");
			a[i]=sc.nextInt();
		}
		//using normal for loop
		/*for(int i=0;i<a.length-1;i++) {
			sum=sum+a[i];
		}*/
		
		//using enchanced for loop
		for(int value:a) {
			sum=sum+value;
		}
		//System.out.println("length of array: "+a.length);
		System.out.println("sum of digits in array: "+sum);
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after sorting: "+Arrays.toString(a));
		
}}
