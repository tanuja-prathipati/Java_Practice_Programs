//print sum of cubes until n

import java.util.*;

public class sumofcubes {

    public static int sum(int n) {
        // if (n == 0) {
        //     return 0;
        // } else {
        //     return (int) Math.pow(n, 3) + sum(n - 1);
        // }
        int k = (n * (n + 1) / 2);
        return k * k;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sum(n));
    }
}
