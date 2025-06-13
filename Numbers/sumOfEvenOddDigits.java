
import java.util.*;

public class sumOfEvenOddDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int digit;
        // int sum = 0;
        // while (n != 0) {
        //     digit = n % 10;
        //     if (digit % 2 == 0) {
        //         sum = sum + digit;
        //     }
        //     n = n / 10;
        // }
        // System.out.println(sum);
        int n = s.nextInt();
        int a[] = new int[n];
        int sumeven = 0;
        int sumodd = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                sumeven += a[i];
            } else {
                sumodd += a[i];
            }
        }
        System.out.println("even sum: " + sumeven);
        System.out.println("odd sum: " + sumodd);
    }
}
