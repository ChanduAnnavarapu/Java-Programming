package Practice;

import java.util.Arrays;

public class CompareTheArrays {

	public static void main(String[] args) {

		int a[]= {2,4,33,21,12,43,76};
		int b[]= {2,4,33,21,12,43,76};
		//1.with equals method from arrays class
		boolean status=Arrays.equals(a,b);
		
		//2.with logic
		/*boolean status=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
			   if(a[i]!=b[i]) {
				   status=false;
			   }
			}
		}
		else {
			status=false;
		}*/
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}

}
