50. Program to Transpose a Matrix

public class Main {
    public static void main(String[] args) {
        // Define a 2D matrix (example)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Call the method to transpose the matrix
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to transpose the matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Create a new matrix for the transpose with flipped dimensions
        int[][] transposedMatrix = new int[cols][rows];

        // Perform the transpose operation
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}
