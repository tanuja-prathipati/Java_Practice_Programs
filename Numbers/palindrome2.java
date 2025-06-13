
import java.util.*;

public class palindrome2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.next();
        StringBuilder sb = new StringBuilder(num);
        String reversed = sb.reverse().toString();
        System.out.println(num.equals(reversed) ? "Palindrome" : "Not a palindrome");
    }
}
