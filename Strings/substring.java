
import java.util.*;

public class substring {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        int count = 0;
        for (int i = str1.length() - 1, j = str2.length() - 1; j >= 0; i--, j--) {
            if (str1.charAt(i) == str2.charAt(j)) {
                count++;
            }
        }
        if (count == str2.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
