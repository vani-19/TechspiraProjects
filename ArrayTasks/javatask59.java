59.Program to Replace All Negative Numbers in an array with 0

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Replace negative numbers with 0
        replaceNegativeWithZero(array);

        // Output the modified array
        System.out.println("Array after replacing negative numbers with 0:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Move to next line

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to replace negative numbers in the array with 0
    public static void replaceNegativeWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0; // Replace negative number with 0
            }
        }
    }
}
