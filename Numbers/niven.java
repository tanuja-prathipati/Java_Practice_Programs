
import java.util.*;

public class niven {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % sumniven(num) == 0) {
            System.out.println("Niven Number");
        } else {
            System.out.println("Not a Niven Number");
        }
    }

    public static int sumniven(int n) {
        int digit;
        int sum = 0;
        while (n != 0) {
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}
