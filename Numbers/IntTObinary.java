
import java.util.*;

public class IntTObinary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int bin[] = new int[10];
        int i = 0;
        while (n != 0) {
            bin[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
    }
}
