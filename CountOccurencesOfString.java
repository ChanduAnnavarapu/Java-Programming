package Practice;

public class CountOccurencesOfString {

	public static void main(String[] args) {
		String s="Selenium Java is testing for  njf  happy newyeare";
		String key = "e";
		String s1=s.replaceAll(key, "");
		System.out.println("occurance of "+key+" is: "+(s.length()-s1.length()) + " times");
	}
}
