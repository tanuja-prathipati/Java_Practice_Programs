
import java.util.*;

public class sparseMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = s.nextInt();
        System.out.println("Enter no. of cols");
        int c = s.nextInt();
        int a[][] = new int[r][c];
        int zerocount = 0;

        System.out.println("Enter Matrix elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = s.nextInt();
                if (a[i][j] == 0) {
                    zerocount++;
                }
            }
        }
        int total = r * c;
        if (zerocount > total / 2) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Not a sparse matrix");
        }
    }
}
