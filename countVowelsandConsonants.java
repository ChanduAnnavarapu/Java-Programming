package Practice;

public class countVowelsandConsonants {
	
	public static void main(String[] args) {
		String k="Alphabetical Order is very good";
		String s=k.toLowerCase();
		char a[]=s.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]== 'a' || a[i] =='e' || a[i]== 'i' || a[i] =='o' || a[i]== 'u') {
				count=count+1;
			}
		}
		System.out.println("the vowel count: "+count);
		System.out.println("the consonant count: "+(a.length-count));
	}
}
