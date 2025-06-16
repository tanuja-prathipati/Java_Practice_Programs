
import java.util.*;

public class MinMaxElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int max = a[0], min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max Element: " + max);
        System.out.println("Min Element: " + min);
    }
}
