package Practice;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		/*String s="welcome to world";
		char a[]=s.toCharArray();
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=rev+s.charAt(i);
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		int temp;
		int a[]= {2,4,5,1,3,6,43,21,45};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
