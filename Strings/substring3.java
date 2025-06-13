//check if a string has "gold" in it or not.

import java.util.*;

public class substring3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = "gold";
        str1 = str1.toLowerCase();
        boolean flag = false;
        for (int i = 0; i < str1.length(); i++) {
            int k = i, j;
            for (j = 0; j < str2.length(); j++) {
                if (str1.charAt(k) != str2.charAt(j)) {
                    break;
                }
                k++;
            }
            if (j == str2.length()) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

    }
}
