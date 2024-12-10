66.Program to rotate a matrix 90 Degrees

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix (assuming it's a square matrix)
        System.out.print("Enter the size of the matrix (N for N x N): ");
        int N = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[N][N];

        // Input the elements of the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotate the matrix 90 degrees
        rotateMatrix(matrix);

        // Output the rotated matrix
        System.out.println("Matrix after 90 degree rotation:");
        printMatrix(matrix);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to rotate the matrix 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix) {
        int N = matrix.length;

        // Step 1: Transpose the matrix (swap rows with columns)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // Swap element at (i, j) with element at (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;
            while (left < right) {
                // Swap elements at left and right
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                // Move pointers towards the center
                left++;
                right--;
            }
        }
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
