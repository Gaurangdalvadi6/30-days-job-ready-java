package twoDArray;

import java.util.Scanner;

public class FindLargestAndSmallestIn2DArray {
    public static void largestAndSmallestInArray(int[][] arr){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int maxRow=0,maxCol=0;
        int minRow=0,minCol=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]>largest){
                    largest= arr[i][j];
                    maxRow=i;
                    maxCol=j;
                }
                if (arr[i][j]<smallest){
                    smallest= arr[i][j];
                    minRow=i;
                    minCol=j;
                }
            }
        }
        System.out.println("Largest : " + largest);
        System.out.println("max found at : ("+maxRow+","+maxCol+")");
        System.out.println("Smallest : " + smallest);
        System.out.println("min found at : ("+minRow+","+minCol+")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        largestAndSmallestInArray(matrix);
    }
}
