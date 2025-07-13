package Practice;

import java.util.Arrays;
import java.util.Collections;

public class SortwithBuiltInMethod {

	public static void main(String[] args) {
		Integer a[]= {81,72,96,44,51,86,77,81,91};
		
		//1.sort
		/*System.out.println("Before Sorting: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After Sorting: "+Arrays.toString(a));*/

		//2.sort
		/*System.out.println("Before Sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting: "+Arrays.toString(a));*/
		
		//3.sort - descending order
		System.out.println("Before Sorting: "+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After Sorting: "+Arrays.toString(a));
	}

}
