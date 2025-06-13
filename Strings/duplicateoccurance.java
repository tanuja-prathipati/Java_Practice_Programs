
import java.util.*;

public class duplicateoccurance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
