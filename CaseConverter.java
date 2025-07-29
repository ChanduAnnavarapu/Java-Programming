package Practice;

public class CaseConverter {
    public static void main(String[] args) {
        String input = "heXaWaRE";
        StringBuilder output = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                output.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                output.append(Character.toUpperCase(ch));
            } else {
                output.append(ch); // for non-letter characters
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Converted: " + output.toString());
    }
}