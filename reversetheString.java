package Practice;

public class reversetheString {

	public static void main(String[] args) {
		String s="madam";
		String rev_str="";
		for(int i=s.length()-1;i>=0;i--) {
			rev_str=rev_str+s.charAt(i);
		}
		
		/*String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			if(i>0) {
			rev_str=rev_str+a[i]+" ";
			}
			else {
				rev_str=rev_str+a[i];	
			}
		}*/
		System.out.println("Reverse string: "+rev_str);
		if(s.equals(rev_str)) {
			System.out.println("palendrome");
		}
		else {
			System.out.println("not palendrome");
		}
	}

}
