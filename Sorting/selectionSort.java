
import java.util.*;

public class selectionSort {

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
        int temp, min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        return a;
    }
}
