//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 8 
/*
 * Task 8.7: Matrix. Read a 3 by 3 matrix. Print it, the sum of each row, 
 * the sum of each column and the sum of the main diagonal.
 */

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter elements for a 3x3 matrix:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Element [" + row + "][" + col + "]: ");
                matrix[row][col] = scanner.nextInt();
            }
        }

        // Print the matrix
        System.out.println("\nMatrix:");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("%4d", matrix[row][col]);
            }
            System.out.println();
        }

        // Sum of each row
        System.out.println("\nRow Sums:");
        for (int row = 0; row < 3; row++) {
            int rowSum = 0;
            for (int col = 0; col < 3; col++) {
                rowSum += matrix[row][col];
            }
            System.out.println("Row " + row + ": " + rowSum);
        }

        // Sum of each column
        System.out.println("\nColumn Sums:");
        for (int col = 0; col < 3; col++) {
            int colSum = 0;
            for (int row = 0; row < 3; row++) {
                colSum += matrix[row][col];
            }
            System.out.println("Column " + col + ": " + colSum);
        }

        // Sum of main diagonal
        int diagSum = 0;
        for (int i = 0; i < 3; i++) {
            diagSum += matrix[i][i];
        }
        System.out.println("\nMain Diagonal Sum: " + diagSum);

        scanner.close();
    }
}
