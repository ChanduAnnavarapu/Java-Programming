package Practice;
import java.util.Scanner;

public class BufferReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();  // input declared here

        StringBuffer sb = new StringBuffer(input); 
        String reversed = sb.reverse().toString(); 

        System.out.println(reversed);

        sc.close();
    }
}