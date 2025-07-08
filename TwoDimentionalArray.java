package Practice;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		/*int a[][]=new int[2][3];
		a[0][0]=12;
		a[0][1]=23;
		a[0][2]=21;
		a[1][0]=26;
		a[1][1]=65;
		a[1][2]=43;*/
		int a[][]= { {100,200,300},
		             {400,500,600} };
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		//int a[ ]= {12,34,32,54,19};
		
		
		}
	}

