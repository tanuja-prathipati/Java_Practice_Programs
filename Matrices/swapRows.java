//swap rows 

import java.util.*;

public class swapRows {

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
        System.out.println("Enter which row to swap");
        int row1 = s.nextInt();
        System.out.println("Enter with which row to swap");
        int row2 = s.nextInt();

        for (int j = 0; j < c; j++) {
            int temp = a[row1 - 1][j];
            a[row1 - 1][j] = a[row2 - 1][j];
            a[row2 - 1][j] = temp;
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
