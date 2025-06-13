//check if characters are in a order or not

import java.util.*;

public class order {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        // int val, val2;
        // boolean flag = true;
        // for (int i = 0; i < str.length() - 1; i++) {
        //     val = (int) str.charAt(i);
        //     val2 = (int) str.charAt(i + 1);
        //     if (Math.abs(val - val2) != 1) {
        //         flag = false;
        //         break;
        //     }
        // }
        // if (flag == true) {
        //     System.out.println("Characters are in order");
        // } else {
        //     System.out.println("Characters are not in order");
        // }
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr).equals(str));

    }
}
