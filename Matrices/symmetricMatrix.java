
import java.util.*;

public class symmetricMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = s.nextInt();
        System.out.println("Enter no. of cols");
        int c = s.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[c][r];

        System.out.println("Enter Matrix A elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                b[i][j] = a[j][i];
            }

        }
        if (r != c) {
            System.out.println("Not symmetric");
            return;
        }
        boolean flag = true;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] != b[i][j]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }

        }

        if (flag) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not Symmetric");
        }
    }
}
