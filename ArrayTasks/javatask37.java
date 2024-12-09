37. Program to implement Binary search

public class Main {
    public static void main(String[] args) {
        // Define a sorted array
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Define the number to search for
        int target = 7;

        // Perform binary search
        int result = binarySearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Method to perform binary search on a sorted array
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        // Continue searching until the left index is greater than the right
        while (left <= right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid; // Element found, return the index
            }

            // If target is smaller, ignore the right half
            if (array[mid] > target) {
                right = mid - 1;
            }
            // If target is larger, ignore the left half
            else {
                left = mid + 1;
            }
        }

        // If we reach here, the element is not present
        return -1;
    }
}
