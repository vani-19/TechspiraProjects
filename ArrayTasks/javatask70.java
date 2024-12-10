70. Program to Implement Binary Search

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
        System.out.println("Enter the elements of the array (sorted in ascending order): ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform Binary Search
        int result = binarySearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to perform binary search
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        // Continue searching while low is less than or equal to high
        while (low <= high) {
            int mid = low + (high - low) / 2;  // To avoid potential overflow of (low + high)

            // If the target is found at mid
            if (array[mid] == target) {
                return mid; // Return the index
            }

            // If the target is smaller, search the left half
            if (array[mid] > target) {
                high = mid - 1;
            }
            // If the target is larger, search the right half
            else {
                low = mid + 1;
            }
        }

        // If the element is not found, return -1
        return -1;
    }
}
