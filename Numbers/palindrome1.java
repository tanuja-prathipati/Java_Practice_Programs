
import java.util.*;

public class palindrome1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit;
        int num = n;
        int res = 0;
        while (n != 0) {
            digit = n % 10;
            res = res * 10 + digit;
            n = n / 10;
        }
        if (num == res) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}
