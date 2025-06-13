
import java.util.*;

public class reversestring {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = s.next();
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
    }
}
