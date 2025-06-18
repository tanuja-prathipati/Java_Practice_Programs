
import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = s.nextInt();
        System.out.println("Enter array elements: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter which num to search: ");
        int num = s.nextInt();

        int b = search(n, num, a);
        if (b == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + (b + 1));
        }

    }

    private static int search(int n, int num, int a[]) {
        for (int i = 0; i < n; i++) {
            if (a[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
