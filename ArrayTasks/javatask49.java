49.Program to find the sum of diagonal elements in a 2d array

public class Main {
    public static void main(String[] args) {
        // Define a 2D array (square matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Call the method to find the sum of diagonal elements
        int sum = sumOfDiagonals(matrix);

        // Print the sum of diagonal elements
        System.out.println("Sum of diagonal elements: " + sum);
    }

    // Method to calculate the sum of diagonal elements in a 2D array
    public static int sumOfDiagonals(int[][] matrix) {
        int sum = 0;
        int n = matrix.length; // Get the number of rows (and columns for a square matrix)

        for (int i = 0; i < n; i++) {
            // Add the primary diagonal element (matrix[i][i])
            sum += matrix[i][i];
            // Add the secondary diagonal element (matrix[i][n-i-1])
            if (i != n - i - 1) { // To avoid adding the center element twice in odd-sized matrices
                sum += matrix[i][n - i - 1];
            }
        }

        return sum;
    }
}
