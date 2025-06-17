
import java.util.*;

public class lengthOfWord {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        // StringTokenizer t = new StringTokenizer(str);
        // while (t.hasMoreTokens()) {
        //     String token = t.nextToken();
        //     if (token.length() % 2 == 0) {
        //         System.out.println(token);
        //     }
        // }
        String[] words = str.split(" ");
        for (String w : words) {
            if (w.length() % 2 == 0) {
                System.out.println(w);
            }
        }

    }
}
