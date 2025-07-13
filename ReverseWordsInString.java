package Practice;
import java.util.Arrays;
public class ReverseWordsInString {

	public static void main(String[] args) {
		String s="Welcome to java world";
		String a[]=s.split(" ");
		int n=a.length-1;
		String b="";
		for(int j=0;j<a.length;j++) {
			String rev_word="";
			for(int i=a[j].length()-1;i>=0;i--){
				rev_word=rev_word+a[j].charAt(i);
			}
			if(j<n) {
				b=b+rev_word+" ";
			}
			else {
				b=b+rev_word;
			}
	}
		System.out.println("The reverse string: "+b);
	}
}
