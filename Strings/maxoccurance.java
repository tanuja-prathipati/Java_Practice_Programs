
import java.util.*;

public class maxoccurance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int a[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            a[(int) str.charAt(i)]++;
        }
        int m = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[j] > a[m]) {
                m = j;
            }
        }
        System.out.println("Max occurred element is: " + (char) m);
    }
}
