package Practice;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int a[]= {81,72,96,44,51,86,77,81,91},temp=0;
		System.out.println("Before Sorting: "+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {  
				if(a[i]>a[j]) {
					temp=a[i]; 
					a[i]=a[j]; 
					a[j]=temp; 
				}
			}
		}
		System.out.println("After Sorting: "+Arrays.toString(a));
	}}
