
import java.util.*;

public class countVowelsConsonants {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vcount++;
            } else {
                ccount++;
            }
        }
        System.out.println("Vowel count: " + vcount);
        System.out.println("Consonants count: " + ccount);
    }
}
