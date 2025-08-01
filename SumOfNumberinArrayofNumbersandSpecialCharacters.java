package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfNumberinArrayofNumbersandSpecialCharacters {

	public static void main(String[] args) {
		String[] array = {"5", "2", "9", "a", "1", "6", "#", "3"};
		int sum=0;
		List l=new ArrayList();
		for(String a:array) {
			try {
				int num=Integer.parseInt(a);
				sum = sum + num;
				l.add(num);
			}
			catch(NumberFormatException e) {
				
			}
		}
		System.out.println(sum);
		Collections.sort(l);
		System.out.println(l);
	}

}
