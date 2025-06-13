
import java.util.*;

public class sumOfMultiplesOf3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit;
        int sum = 0;
        while (n != 0) {
            digit = n % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                sum += digit;
            }
            n = n / 10;
        }
        System.out.println(sum);
    }
}
