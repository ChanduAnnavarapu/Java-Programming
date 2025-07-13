package Practice;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String s="Selenium Java is testing for  njf  happy newyeare";
		s=s.replaceAll(" ", "");
		System.out.println(s);

	}

}
