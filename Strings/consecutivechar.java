
import java.util.*;

public class consecutivechar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int val, val2;
        boolean flag = false;
        for (int i = 0; i < str.length() - 1; i++) {
            val = (int) str.charAt(i);
            val2 = (int) str.charAt(i + 1);
            if (Math.abs(val - val2) == 0) {
                System.out.print(str.charAt(i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No consecutive duplicate characters found");
        }

    }
}
