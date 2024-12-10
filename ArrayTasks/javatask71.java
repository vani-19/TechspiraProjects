71.Program to find the maximum product of two elements in an array

import java.util.Scanner;
import java.util.Arrays;

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
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the maximum product of two elements
        int maxProduct = findMaxProduct(array);

        // Output the result
        System.out.println("The maximum product of two elements in the array is: " + maxProduct);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to find the maximum product of two elements
    public static int findMaxProduct(int[] array) {
        // Sort the array
        Arrays.sort(array);

        // Compare the product of the two largest elements and the two smallest elements
        int n = array.length;
        int product1 = array[n - 1] * array[n - 2];  // Product of the two largest elements
        int product2 = array[0] * array[1];  // Product of the two smallest elements

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }
}
