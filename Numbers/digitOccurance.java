
import java.util.*;

public class digitOccurance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int n = s.nextInt();
        int digit;
        int count = 0;
        while (num != 0) {
            digit = num % 10;
            if (digit == n) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
