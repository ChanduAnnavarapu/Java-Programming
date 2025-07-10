package Practice;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		//1.using if statements
		/*if(a>b && a>c) {
			System.out.println("a is largest"+a);
		}
		else if(b>a && b>c) {
			System.out.println("b is largest"+b);
		}
		else {
			System.out.println("c is largest"+c);
		}*/
		
		//2.using terinary operator
		int largest=a>b?a:b;
		largest=largest>c?largest:c;
		System.out.println(largest+" is largest number");
	}

}
