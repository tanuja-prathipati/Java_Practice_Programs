//remove duplicate characters and remove space between words

import java.util.*;

public class duplicateChars {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replaceAll(" ", "");
        char[] a = str.toCharArray();
        String res = "";
        for (int i = 0; i < str.length() - 1; i++) {
            boolean f = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                res += a[i];
            }
        }
        System.out.println(res);

    }
}
