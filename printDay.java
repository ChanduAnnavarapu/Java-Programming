package Practice;

import java.util.Scanner;

public class printDay {

	public static void main(String[] args) {
		int week_no=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		String value = sc.next();
		switch(value) {
		case "mango":System.out.println("Monday"); break;
		case "apple":System.out.println("tuesday"); break;
		default:System.out.println("Invalid");
		}
	}


}
