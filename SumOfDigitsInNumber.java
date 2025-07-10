package Practice;

import java.util.Scanner;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		long n=sc.nextLong();
		long k,sum=0;
		while(n>0) {
			k=n%10;
			sum=sum+k;
			n=n/10;
		}
		System.out.println("Sum of Digits in numbers: "+sum);

	}

}

