
import java.util.*;

public class duckNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit;
        boolean flag = false;
        while (n != 0) {
            digit = n % 10;
            if (digit == 0) {
                flag = true;
                break;
            }
            n = n / 10;
        }
        if (flag == true) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a duck number");
        }
    }
}
