
import java.util.*;

public class perfectnum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}
