package Practice;

public class reversetheString {

	public static void main(String[] args) {
		String s="habibi come to dubai";
		String rev_str="";
		/*for(int i=s.length()-1;i>=0;i--) {
			rev_str=rev_str+s.charAt(i);
		}
		System.out.println("Reverse string: "+rev_str);*/
		
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			if(i>0) {
			rev_str=rev_str+a[i]+" ";
			}
			else {
				rev_str=rev_str+a[i];	
			}
		}
		System.out.println("Reverse string: "+rev_str);
	}

}
