53. Program to Sum All Elements in a 2D Array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns for the 2D array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the 2D array
        int[][] array = new int[rows][cols];

        // Input the elements of the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Variable to store the sum of elements
        int sum = 0;

        // Loop through the 2D array and sum all elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }

        // Output the sum of all elements
        System.out.println("Sum of all elements in the 2D array: " + sum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
