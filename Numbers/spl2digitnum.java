
import java.util.*;

public class spl2digitnum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        int digit1, digit2, res;
        digit1 = n % 10;
        digit2 = n / 10;
        res = (digit1 + digit2) + (digit1 * digit2);
        if (res == num) {
            System.out.println("Special");
        } else {
            System.out.println("Not Special");
        }
    }

    // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);
    //     int n = s.nextInt();
    //     int num = sum(n) + prod(n);
    //     if (n == num) {
    //         System.out.println("Special Number");
    //     } else {
    //         System.out.println("Not a special number");
    //     }
    // }
    // public static int sum(int n) {
    //     int digit;
    //     int sum = 0;
    //     while (n != 0) {
    //         digit = n % 10;
    //         sum += digit;
    //         n = n / 10;
    //     }
    //     return sum;
    // }
    // public static int prod(int m) {
    //     int digit;
    //     int prod = 1;
    //     while (m != 0) {
    //         digit = m % 10;
    //         prod *= digit;
    //         m = m / 10;
    //     }
    //     return prod;
    // }
}
