package Practice;

public class removeJunkfromString {

	public static void main(String[] args) {
		String s="Selenium #$%$ gvd$5$* gg^65676 testing H^&*(&(* YNHJBV";
		s=s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);

	}

}
