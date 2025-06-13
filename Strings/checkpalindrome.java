
import java.util.*;

public class checkpalindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        if (reversed.equals(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
