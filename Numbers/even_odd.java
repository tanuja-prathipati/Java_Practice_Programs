
import java.util.*;

public class even_odd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = s.nextInt();
        if (n <= 0) {
            //System.out.println("Invalid num: " + n);
            throw new IllegalArgumentException("Invalid num: " + n);
        } else {
            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
