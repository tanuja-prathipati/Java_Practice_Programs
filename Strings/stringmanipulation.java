
import java.util.*;

public class stringmanipulation {

    public static void main(String[] args) {
        String[] a = {"hello", "world", "java", "code", "example"};

        System.out.println("Original array: " + Arrays.toString(a));

        // 1. Convert to Uppercase
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i].toUpperCase();
        }
        System.out.println("Uppercase: " + Arrays.toString(a));

        // 2. Convert to Lowercase
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i].toLowerCase();
        }
        System.out.println("Lowercase: " + Arrays.toString(a));

        // 3. Reverse each string
        for (int i = 0; i < a.length; i++) {
            a[i] = new StringBuilder(a[i]).reverse().toString();
        }
        System.out.println("Reversed: " + Arrays.toString(a));

        // 4. Concatenate with another word
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + "_test";
        }
        System.out.println("Concatenated: " + Arrays.toString(a));

        // 5. Replace a character
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i].replace('e', '*');
        }
        System.out.println("Replaced 'e' with '*': " + Arrays.toString(a));

        // 6. Trim (example with padded spaces)
        a[0] = "  sample  ";
        a[0] = a[0].trim();
        System.out.println("After trim on first element: " + Arrays.toString(a));

        // 7. Length of each string
        System.out.print("Lengths: ");
        for (String x : a) {
            System.out.print(x.length() + " ");
        }
        System.out.println();

        // 8. Substring (first 3 chars if length >= 3)
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() >= 3) {
                a[i] = a[i].substring(0, 3);
            }
        }
        System.out.println("Substring (first 3 chars): " + Arrays.toString(a));

        // 9. Compare with another string
        System.out.println("First element equals 'sam': " + a[0].equals("sam"));

        // 10. Check prefix/suffix
        System.out.println("Second element starts with 'wo': " + a[1].startsWith("wo"));
        System.out.println("Second element ends with 'ld': " + a[1].endsWith("ld"));

        // 11. Split and join
        String s = "a,b,c";
        String[] parts = s.split(",");
        String joined = String.join("-", parts);
        System.out.println("Split and joined string: " + joined);

        // 12. Sorting
        Arrays.sort(a);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
