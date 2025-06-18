
import java.util.*;

public class insertionSort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        a = sorting(n, a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static int[] sorting(int n, int a[]) {
        int temp;
        for (int i = 1; i < n - 1; i++) {
            int j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j = j - 1;
            }

        }

        return a;
    }
}
