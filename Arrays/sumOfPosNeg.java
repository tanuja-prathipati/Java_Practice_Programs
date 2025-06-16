
import java.util.*;

public class sumOfPosNeg {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int psum = 0, nsum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0 && a[i] != 0) {
                psum += a[i];
            } else if (a[i] < 0 && a[i] != 0) {
                nsum += a[i];
            }
        }
        System.out.println("Positive sum: " + psum);
        System.out.println("Negative sum: " + nsum);
    }
}
