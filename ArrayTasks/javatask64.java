64.Program to multiply Two Matrices

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for the first matrix
        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix A: ");
        int colsA = scanner.nextInt();

        // Input dimensions for the second matrix
        System.out.print("Enter the number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix B: ");
        int colsB = scanner.nextInt();

        // Check if multiplication is possible (columns of A must be equal to rows of B)
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Number of columns of Matrix A must be equal to number of rows of Matrix B.");
            return;
        }

        // Initialize matrices A, B, and the result matrix C
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        // Input elements for Matrix A
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input elements for Matrix B
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication: result[i][j] = sum of matrixA[i][k] * matrixB[k][j]
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Output the result matrix
        System.out.println("Resultant Matrix (Matrix A * Matrix B):");
        printMatrix(result);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
