65. Program to Check if Two Matrices are Equal

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns for both matrices
        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix B: ");
        int colsB = scanner.nextInt();

        // If the dimensions of the matrices are not the same, they cannot be equal
        if (rowsA != rowsB || colsA != colsB) {
            System.out.println("The matrices are not equal. They have different dimensions.");
            return;  // Exit the program
        }

        // Initialize matrices A and B
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

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

        // Check if matrices are equal
        if (areMatricesEqual(matrixA, matrixB)) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to check if two matrices are equal
    public static boolean areMatricesEqual(int[][] matrixA, int[][] matrixB) {
        // Loop through the matrices and compare each element
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {
                    return false;  // Return false if any element is different
                }
            }
        }
        return true;  // Return true if all elements are equal
    }
}
