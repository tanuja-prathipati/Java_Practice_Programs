
import java.util.*;

public class fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // if (n < 1) {
        //     return;
        // }
        // int a[] = new int[n];
        // a[0] = 0;
        // if (n > 1) {
        //     a[1] = 1;
        //     for (int i = 2; i < n; i++) {
        //         a[i] = a[i - 1] + a[i - 2];
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }

        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + "" + n2);
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
