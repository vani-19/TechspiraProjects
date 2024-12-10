58.Programs to shift Elements of an array to the Right by K Positions 

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

        // Input the number of positions to shift
        System.out.print("Enter the number of positions to shift: ");
        int k = scanner.nextInt();

        // Handle cases where k is greater than the size of the array
        k = k % n;  // To avoid unnecessary full rotations

        // Perform the right shift
        rightShiftArray(array, k);

        // Output the array after right shift
        System.out.println("Array after shifting right by " + k + " positions:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to shift the array to the right by k positions
    public static void rightShiftArray(int[] array, int k) {
        // Edge case: If k is 0 or the array is empty, no shift is needed
        if (k == 0 || array.length == 0) {
            return;
        }

        // Create a temporary array to store the last k elements
        int[] temp = new int[k];

        // Copy the last k elements to the temporary array
        for (int i = 0; i < k; i++) {
            temp[i] = array[array.length - k + i];
        }

        // Shift the rest of the array elements to the right
        for (int i = array.length - 1; i >= k; i--) {
            array[i] = array[i - k];
        }

        // Copy the elements from the temporary array to the front of the original array
        for (int i = 0; i < k; i++) {
            array[i] = temp[i];
        }
    }
}

