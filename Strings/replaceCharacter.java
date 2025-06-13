//replace character with next character

import java.util.*;

public class replaceCharacter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        int val;
        for (int i = 0; i < str.length(); i++) {
            val = (int) str.charAt(i);
            sb.append((char) (val + 1));
        }
        System.out.println(sb.toString());
    }
}
