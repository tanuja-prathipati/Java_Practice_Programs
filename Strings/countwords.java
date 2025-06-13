
import java.util.*;

public class countwords {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                count++;
            }
        }
        System.out.println(count + 1);

    }
}
