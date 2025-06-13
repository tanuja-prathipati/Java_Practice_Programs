
import java.util.*;

public class substring2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        if (str1.endsWith(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
