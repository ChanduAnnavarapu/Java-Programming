package Practice;

public class printTwoOutputsfromsingleString {

	public static void main(String[] args) {
		String s="aAbBcCdDeEZsjhHJB";
		StringBuffer lower=new StringBuffer();
		StringBuffer higher=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				lower.append(s.charAt(i));
			}
			else {
				higher.append(s.charAt(i));
			}
		}
		System.out.println("lowercase elements: "+lower);
		System.out.println("Uppercase elements: "+higher);
	}
}
