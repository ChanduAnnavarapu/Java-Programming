package Practice;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		//1. using loging
		/*int temp=n,k;
		 int rev=0;	
		while(n>0) { //123123
			rev=(rev*10)+n%10;;
			n=n/10;
		}*/
		
		//2.using string buffer method
		/*StringBuffer sb=new StringBuffer(String.valueOf(n));
		StringBuffer rev=sb.reverse();
		System.out.println("reverse number is "+rev);
		if(n==Integer.parseInt(rev.toString())) { //here rev is string buffer datatype.parseInt() expects string so converted to string.
			System.out.println(sb+" is palendrome");
		}
		else {
			System.out.println(sb+" not a palendrome");
		}*/
		
		//3.String Builder method
		StringBuilder sb1=new StringBuilder();
		sb1.append(n);
		StringBuilder rev=sb1.reverse();
		System.out.println("reverse number is "+rev);
		

	}

}
