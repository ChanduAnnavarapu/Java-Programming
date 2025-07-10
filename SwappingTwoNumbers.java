package Practice;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a,b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Value of a: "+a+"\t"+"Value of b: "+b);
		
		//1.swapping with third variable
		/*int t=b;
		b=a;
		a=t;*/
		
		//2.swapping without third variable and using (+ and -) //let: a=20,b=10
		/*a=a+b; //30,10
		b=a-b; //30,20
		a=a-b; //a=10,b=20*/
		
		//3.swapping without third variable and using (* and /) //let: a=20,b=10 
		/*a=a*b; //a=200,b=10 //-92, -4
		b=a/b; //a=200,b=20 //-92,-23
		a=a/b; //a=10,b=20	*/
		
		//4.bitwise XOR say a=20, b=10 convert them in binary
		/*a=a^b;  //binary of a=10100 b=1010 a=a^b=11110 ->a=30
		b=a^b;
		a=a^b;*/
		
		//5.with single statement
		b=a+b-(a=b);
		
		System.out.println("Value of a: "+a+"\t"+"Value of b: "+b);

	}

}
