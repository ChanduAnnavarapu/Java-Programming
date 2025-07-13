package Practice;

import java.util.Scanner;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of digits in array");
		int n=sc.nextInt();
		System.out.println("enter the array");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum1=0,sum2=0;
		int b=a[0], m=a[a.length-1];
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		
		for(int i=b;i<=m;i++) {
			sum2=sum2+i;
		}
		
		if(sum1==sum2) {
			System.out.println("no missing term");
		}
		else {
			System.out.println("Missing term is: "+(sum2-sum1));
		}
		
	}

}
