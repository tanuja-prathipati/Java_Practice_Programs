//check if a string has "gold" in it or not.

import java.util.*;

public class removevowels {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                continue;
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
