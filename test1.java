package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test1 {

	public static void main(String[] args) {
		int a[]= {23,43,44,11,32,44,22,12,22,11};
		List al=new ArrayList();
		for(int num:a) {
			al.add(num);
		}
		System.out.println(al);
		
		Set s=new HashSet(al);
		System.out.println(s);

		/*Set<Integer> s=new HashSet<Integer>();
		for(int n:a) {
			s.add(n);
		}
		
		System.out.println(s);
		
		List ls=new ArrayList(s);
		System.out.println(ls);
		ls.add(23);
		System.out.println(ls);*/
		/*for(int i=0;i<a.length;i++) {
		if(al.indexOf(a[i]) == -1) {
			al.add(a[i]);
		}}
		System.out.println(al);
		System.out.println(al.get(4));*/
	}
}
