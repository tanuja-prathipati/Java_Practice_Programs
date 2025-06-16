
import java.util.*;

public class sumOddIndex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = s.nextInt();
        int a[] = new int[n];
        int sum = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sum += a[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
