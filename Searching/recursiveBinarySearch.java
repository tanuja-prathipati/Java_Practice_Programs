
import java.util.*;

public class recursiveBinarySearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = s.nextInt();
        int low = 0;
        int high = n - 1;
        System.out.println("Enter array elements: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter which num to search: ");
        int num = s.nextInt();
        Arrays.sort(a);

        int b = search(n, num, a, low, high);
        if (b == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + (b + 1));
        }

    }

    private static int search(int n, int num, int a[], int low, int high) {
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == num) {
                return mid;
            } else if (a[mid] < num) {
                return search(n, num, a, mid + 1, high);
            } else {
                return search(n, num, a, low, mid - 1);
            }

        }

        return -1;
    }
}
