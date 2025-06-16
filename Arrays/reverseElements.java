
import java.util.*;

public class reverseElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        int a[] = new int[n];
        int rev[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Reversed Elements: ");
        // for (int i = n - 1; i >= 0; i--) {
        //     System.out.println(a[i]);
        // }
        for (int i = 0, j = n; i < a.length; i++, j--) {
            rev[j - 1] = a[i];
        }
        for (int k = 0; k < n; k++) {
            System.out.print(rev[k] + " ");
        }
    }
}
