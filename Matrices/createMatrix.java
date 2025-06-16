
import java.util.*;

public class createMatrix {

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

        System.out.println("Matrix Elements are: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
