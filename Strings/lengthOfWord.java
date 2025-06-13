
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
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }

    }
}
