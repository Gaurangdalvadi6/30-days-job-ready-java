package twoDArray;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix= new int[3][3];
        int m= matrix.length, n=matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

    }
}
