package Practice;

public class findDuplicateElementInArray {

	public static void main(String[] args) {
		String a[]= {"java","c","c++","c","python","python"};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {  
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("duplicate found: "+a[i]);
			}
		}

	}

}
