package Practice;

public class permutationsOfString {

	public static void main(String[] args) {
		        String str = "abc";
		        permute(str, "");
	}
		    // Recursive function to generate permutations
		    public static void permute(String str, String result) {
		        if (str.length() == 0) {
		            System.out.println(result);
		            return;
		        }

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);  // current character
		            String remaining = str.substring(0, i) + str.substring(i + 1);
		            permute(remaining, result + ch);  // recursive call
		        }
		    }
}
