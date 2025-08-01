package Practice;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s1="welcome to Java";
		String s2="     Selenium is Automation tool        ";
		String s3="abc@gmail.com";
		StringBuilder s4=new StringBuilder("how are you");
		StringBuilder s5=new StringBuilder("well wisher");
		System.out.println(s1.length());
        System.out.println(s1+" "+s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s2);
        
        System.out.println(s2.trim() + ": length of " + s2.trim().length());
        
        System.out.println((s1.charAt(4)));
        System.out.println(s1.equalsIgnoreCase("WELCOME TO JAVa"));
        System.out.println(s1.replace('e','a'));
        System.out.println(s1.substring(0,5));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase().trim());
        
        //split
        String a[]=s3.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(Arrays.toString(a));
        
        System.out.println((s1.toUpperCase()).equals("WELCOME TO JAVa".toUpperCase()));
        System.out.println(s4.append("add"));
        System.out.println(s1);
	}
	
}
