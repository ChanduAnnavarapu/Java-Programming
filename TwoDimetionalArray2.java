package Practice;

import java.util.Scanner;

public class TwoDimetionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int r=sc.nextInt();
		System.out.println("enter number of columns");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter array elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			System.out.println("enter the value of a["+i+"]"+"["+j+"]");
		 a[i][j] = sc.nextInt();
		}
		}
		/*for(int i=0;i<n;i++) {
			System.out.print(a[i] + " ");
		}
		for(int x:a) {
			System.out.print(x+ " ");
		}*/
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("row count: "+a.length);
		System.out.println("column count: "+a[0].length);

	}

}
