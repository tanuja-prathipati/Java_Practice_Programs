
import java.util.*;

public class bubbleSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        a = enhancedSort(n, a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    // public static int[] bubble(int n, int a[]) {
    //     int temp;
    //     for (int i = 0; i < n - 1; i++) {
    //         for (int j = 0; j < n - i - 1; j++) {
    //             if (a[j] > a[j + 1]) {
    //                 temp = a[j];
    //                 a[j] = a[j + 1];
    //                 a[j + 1] = temp;
    //             }
    //         }
    //     }
    //     return a;
    // }
    public static int[] enhancedSort(int n, int a[]) {
        int temp, i = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            i++;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        return a;
    }
}
