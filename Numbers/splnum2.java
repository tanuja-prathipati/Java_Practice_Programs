
import java.util.*;

public class splnum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting num: ");
        int s = sc.nextInt();
        System.out.println("Ending num: ");
        int e = sc.nextInt();
        int digit1, digit2, res;
        for (int i = s; i <= e; i++) {
            digit1 = i % 10;
            digit2 = i / 10;
            res = (digit1 + digit2) + (digit1 * digit2);
            if (res == i) {
                System.out.println(i + " ");
            }
        }
    }
}
