package Practice;

import java.util.Scanner;

public class NoOfEvenAndOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		long n=sc.nextLong(),k;
		int even=0,odd=0;
		while(n>0) {
			k=n%10;
			if(k%2==0) {
				even++;
			}
			else {
				odd++;
			}
			n=n/10;
		}
		System.out.println("even no: "+even+"\t"+"odd no: "+odd);

	}

}
