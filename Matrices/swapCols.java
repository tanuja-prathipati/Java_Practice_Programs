//swap cols

import java.util.*;

public class swapCols {

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
        System.out.println("Enter which col to swap");
        int col1 = s.nextInt();
        System.out.println("Enter with which col to swap");
        int col2 = s.nextInt();

        for (int i = 0; i < r; i++) {
            int temp = a[i][col1 - 1];
            a[i][col1 - 1] = a[i][col2 - 1];
            a[i][col2 - 1] = temp;
        }
        System.out.println();

        System.out.println("Swapped Matrix Elements are: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
