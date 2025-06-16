//shift even numbers to left and odd numbers to right in an array

import java.util.*;

public class shiftnumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int res[] = new int[n];
        int l = 0, r = n - 1;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                res[l++] = a[i];
            } else {
                res[r--] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
