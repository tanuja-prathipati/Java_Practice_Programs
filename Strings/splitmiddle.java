//return middle characters of the string

import java.util.*;

public class splitmiddle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int len = str.length();
        // if (len % 2 != 0) {
        //     System.out.println(str.charAt(len / 2));
        // } else {
        //     System.out.print(str.charAt((len / 2) - 1));
        //     System.out.print(str.charAt(len / 2));

        // }
        if (len % 2 == 0) {
            System.out.println(str.substring(len / 2 - 1, len / 2 + 1));
        } else {
            System.out.println(str.substring(len / 2, len / 2 + 1));
        }

    }
}
