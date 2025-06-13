
import java.util.*;

public class printprime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting Num: ");
        int s = sc.nextInt();
        System.out.println("Ending Num: ");
        int e = sc.nextInt();
        System.out.println("Prime Numbers are: ");
        for (int i = s; i <= e; i++) {
            int count = 0;
            if (i > 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
