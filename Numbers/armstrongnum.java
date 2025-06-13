
import java.util.*;

public class armstrongnum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (armstrong(n) == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }

    }

    public static int armstrong(int n) {
        int digit;
        int sum = 0;
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        while (n != 0) {
            digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;
        }
        return sum;
    }
}
