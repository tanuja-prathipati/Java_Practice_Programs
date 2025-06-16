//print last m elements

import java.util.*;

public class lastElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        System.out.println("Enter how many elements to be printed: ");
        int m = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        if (m < n) {
            for (int i = n - m; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("Enter valid input");
        }

    }
}
