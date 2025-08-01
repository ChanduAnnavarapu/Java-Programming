package Practice;

import java.util.Arrays;

public class reverseEachWordinString {

	public static void main(String[] args) {
		String s="Java Is Good Programming Language";
		String finalString="";
		String a[]=s.split(" ");
		for(String word:a) {
			String rev="";
			for(int i=word.length()-1;i>=0;i--) {
				rev=rev+word.charAt(i);
			}
			finalString=finalString+rev+" ";
		}
		System.out.println("string after reverse: "+finalString);
	}

}
