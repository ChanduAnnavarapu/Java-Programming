package Practice;

public class BinarySearchElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int key=4;
		boolean status=false;
		int l=0;
		int h=a.length-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(a[m]==key) {
				System.out.println("Element found at: "+m);
				status=true;
				break;
			}
			if(a[m]<key) {
				l=m+1;
			}
			if(a[m]>key) {
				h=m-1;
			}
		}
		if(status==false) {
			System.out.println("element not found");
		}
	}
}
