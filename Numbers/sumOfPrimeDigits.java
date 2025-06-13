
import java.util.*;

public class sumOfPrimeDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit;
        int sum = 0;
        while (n != 0) {
            digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum += digit;
            }
            n = n / 10;
        }
        System.out.println(sum);
    }
}
