package Lab02;

import java.util.Scanner;

public class AddTwoMatrices {

    public static void main(String[] args) {

        int r, c, i, j; // row, column
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the row size of the matrix:");
        r = in.nextInt();

        System.out.println("Enter the column size of the matrix:");
        c = in.nextInt();

        int array1[][] = new int[r][c];
        int array2[][] = new int[r][c];
        int sum[][] = new int[r][c];

        System.out.println("Input elements of the first matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                array1[i][j] = in.nextInt();
            }
        }

        System.out.println("Input elements of the second matrix:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                array2[i][j] = in.nextInt();
            }
        }

        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array2.length; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
