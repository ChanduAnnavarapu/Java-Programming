package Practice;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		long n=sc.nextLong();
		int count=0;
		
		//1.with looping
		/*while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("length of number: "+count);*/
		
		//2.with converting to string
		int length=String.valueOf(n).length();
		System.out.println("length of number: "+length);
	}
}
