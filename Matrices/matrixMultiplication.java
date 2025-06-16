
import java.util.*;

public class matrixMultiplication {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of rows for M1");
        int r1 = s.nextInt();
        System.out.println("Enter no. of cols for M1");
        int c1 = s.nextInt();
        int a[][] = new int[r1][c1];

        System.out.println("Enter Matrix A elements: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter no. of rows for M2");
        int r2 = s.nextInt();
        System.out.println("Enter no. of cols for M2");
        int c2 = s.nextInt();
        System.out.println("Enter Matrix B elements: ");
        int b[][] = new int[r2][c2];
        int prod[][] = new int[r1][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = s.nextInt();
            }

        }
        if (c1 != r2) {
            System.out.println("Matrix Multiplication not possible");
            return;
        }

        System.out.println("Resultant Matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    prod[i][j] += a[i][k] * b[k][j];
                }
            }

        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println();

        }

    }
}
