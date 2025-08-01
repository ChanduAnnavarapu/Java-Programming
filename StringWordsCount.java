package Practice;
import java.util.Arrays;

public class StringWordsCount {

	public static void main(String[] args) {
		String s="Test automation java automation";
		String a[]=s.split(" ");
		String wod="";
		//System.out.println(Arrays.toString(a));
		
		//alternate method to find out duplicates in string
		for(int i=0;i<a.length;i++) {
			String ch=a[i];
			if(wod.indexOf(ch) == -1) {
				wod=wod+ch+" ";
			}
		}
		//System.out.println(wod);
		String wodArray[]=wod.split(" ");
		for(int i=0;i<wodArray.length;i++) {
			int count=0;
			for(int k=0;k<a.length;k++) {
				if(wodArray[i].equals(a[k])) {
					count=count+1;
				}
			}
		System.out.println(wodArray[i]+" : "+count+" times");
		}

	}

}
