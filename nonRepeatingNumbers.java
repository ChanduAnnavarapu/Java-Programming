package Practice;

import java.util.ArrayList;
import java.util.List;

public class nonRepeatingNumbers {

	public static void main(String[] args) {
		int[] a= {12,23,11,22,22,12,43};
		int count;
		List noDuplicates=new ArrayList();
		List l=new ArrayList();
		for(int ar:a) {
			l.add(ar);
		}
		System.out.println(l);
		
		for(int i=0;i<l.size();i++) {
			count=0;
			for(int j=0;j<l.size();j++) {
				if(l.get(i).equals(l.get(j))) {
					count=count+1;
				}
			}
			if(count==1) {
				noDuplicates.add(l.get(i));
			}
		}
		System.out.println("no duplicates: "+noDuplicates);
	}

}
