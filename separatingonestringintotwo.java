package Practice;

public class separatingonestringintotwo {

	public static void main(String[] args) {
		String s="Subbu123raj";
		StringBuffer letters=new StringBuffer();
		StringBuffer digits=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				letters.append(s.charAt(i));
			}
			else if(Character.isDigit(s.charAt(i))) {
				digits.append(s.charAt(i));
			}
		}
		System.out.println("letters elements: "+letters);
		System.out.println("digits elements: "+digits);
	}

}
