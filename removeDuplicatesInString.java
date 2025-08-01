package Practice;

public class removeDuplicatesInString {

	public static void main(String[] args) {
	String a="Chandu Annavarapu";
	String s=a.toLowerCase().replaceAll(" ", "");
	String wod="";
	
	//method to find out duplicates in string
	/*for(int i=0;i<s.length();i++) {
		boolean status=false;
		for(int k=0;k<wod.length();k++) {
			if(s.charAt(i) == (wod.charAt(k))){
				status=true;
			}
			}
		if(status == false) {
			wod=wod+s.charAt(i);
		}
	  }*/
	
	//alternate method to find out duplicates in string
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(wod.indexOf(ch) == -1) {
			wod=wod+ch;
		}
	}
	System.out.println(wod);
	
	for(int i=0;i<wod.length();i++) {
		int count=0;
		for(int k=0;k<s.length();k++) {
			if(wod.charAt(i) == s.charAt(k)) {
				count=count+1;
			}
		}
	//System.out.println(wod.charAt(i)+" present in "+count+" times");
	System.out.print(wod.charAt(i)+""+count);
	}
}}
