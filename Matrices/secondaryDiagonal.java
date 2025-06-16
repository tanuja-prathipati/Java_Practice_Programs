
import java.util.*;

public class secondaryDiagonal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = s.nextInt();
        System.out.println("Enter no. of cols");
        int c = s.nextInt();
        int a[][] = new int[r][c];

        System.out.println("Enter Matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Diagonal Elements are: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((i + j) == c - 1) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }

    }
}
