67.Program to find the trace of a Matrix

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

        // Calculate and print the trace of the matrix
        int trace = calculateTrace(matrix);
        System.out.println("The trace of the matrix is: " + trace);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to calculate the trace of a matrix
    public static int calculateTrace(int[][] matrix) {
        int N = matrix.length;
        int trace = 0;

        // Sum the diagonal elements
        for (int i = 0; i < N; i++) {
            trace += matrix[i][i];  // Add the element at (i, i)
        }

        return trace;
    }
}
