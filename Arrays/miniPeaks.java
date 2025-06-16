//print elements that are greater than immediate left and right element

import java.util.*;

public class miniPeaks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Peak Elements: ");
        for (int i = 1; i < n - 1; i++) {
            if (a[i] > a[i + 1] && a[i] > a[i - 1]) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
