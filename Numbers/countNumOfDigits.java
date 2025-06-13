
import java.util.*;

public class countNumOfDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        while (n != 0) {
            count += 1;
            n = n / 10;
        }
        System.out.println(count);
    }
}
