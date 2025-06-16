
import java.util.*;

public class matrixTranspose {

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
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                b[i][j] = a[j][i];
            }

        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
