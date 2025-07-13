package Practice;

import java.util.*;

public class MaxandMinNumberInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of digits in array");
		int n=sc.nextInt();
		System.out.println("enter the array");
		int a[]=new int[n],temp=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		//1.with array class method
		/*Arrays.sort(a);
		System.out.println("Array after sorting: "+Arrays.toString(a));
		System.out.println("Max number of array: "+a[a.length-1]+" Min number of array "+a[0]);*/
		
		//2. with logic
		/*for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {  //12,32,11,54
				if(a[i]>a[j]) {
					temp=a[i]; //12
					a[i]=a[j]; //11
					a[j]=temp; //12
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Max number of array: "+a[a.length-1]+" Min number of array "+a[0]);*/
		
		//3.with logic
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Max number of array: "+max+" Min number of array "+min);
	}
}
