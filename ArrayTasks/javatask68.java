68. Program to check if a matrix is Symmetric

import java.util.Scanner;

public class Main{
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

        // Check if the matrix is symmetric
        if (isSymmetric(matrix)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to check if the matrix is symmetric
    public static boolean isSymmetric(int[][] matrix) {
        int N = matrix.length;

        // Loop through the matrix and check for symmetry
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // Compare matrix[i][j] with matrix[j][i]
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // Return false if any element is not equal
                }
            }
        }

        // If all elements are symmetric
        return true;
    }
}
