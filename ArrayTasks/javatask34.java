public class Main {
    public static void main(String[] args) {
        // Define a square matrix (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Calculate and print the sum of diagonal elements
        int diagonalSum = sumDiagonalElements(matrix);
        System.out.println("The sum of diagonal elements is: " + diagonalSum);
    }

    // Method to find the sum of diagonal elements in a square matrix
    public static int sumDiagonalElements(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;  // Assuming it's a square matrix

        // Loop through the matrix and add diagonal elements
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];  // Primary diagonal element
            sum += matrix[i][n - 1 - i];  // Secondary diagonal element
        }

        // If the matrix size is odd, the middle element gets added twice
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];  // Subtract the middle element once
        }

        return sum;
    }
}
