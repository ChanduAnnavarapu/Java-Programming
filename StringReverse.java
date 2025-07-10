package Practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		String rev ="";
		System.out.println(s.length());
		//1,using string buffer method
		/*StringBuffer sb=new StringBuffer(s);
		StringBuffer rev1=sb.reverse();
		System.out.println("reverse string: "+rev1);*/
		
		//2.using for loop
		/*for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("reverse string: "+rev);*/
		
		//3.using character array
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("reverse string: "+rev);
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("String is palendrome");
		}
		else {
			System.out.println("String is not a palendrome");
		}
	}

}
