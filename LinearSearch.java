package Practice;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int search_ele=40;
		boolean status=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==search_ele) {
				System.out.println("element is found at: "+i);
				status=true;
			}
		}
		if(status==false) {
			System.out.println("element not found");
		}
	}
}
