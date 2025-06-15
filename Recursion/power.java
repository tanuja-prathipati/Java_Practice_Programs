
import java.util.*;

public class power {

    public static int pow(int base, int exponent) {
        // if (exponent == 1) {
        //     return base;
        // } else {
        //     return base * pow(base, exponent - 1);
        // }
        return (int) Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        System.out.println(pow(base, exponent));
    }
}
