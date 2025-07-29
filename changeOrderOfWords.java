package Practice;

import java.util.Scanner;

public class changeOrderOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		String a[]=str.split(" ");
		String s="";
		for(int i=a.length-1;i>=0;i--) {
			/*String rev="";
			for(int k=a[i].length()-1;k>=0;k--) {
			rev=rev+a[i].charAt(k);
			}*/
			s=s+a[i]+" ";
		}
		System.out.println("reverse string: "+s);
		//System.out.println("length of String: "+a.length);
	}

}
