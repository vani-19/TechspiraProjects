47. Program to perform binary search on a sorted array

public class Main {
    public static void main(String[] args) {
        // Define a sorted array
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Define the target element to search for
        int target = 7;

        // Perform binary search
        int result = binarySearch(sortedArray, target);

        // Print the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Binary search method to find the index of the target element
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Check if the target element is present at mid
            if (array[mid] == target) {
                return mid; // Return the index of the found element
            }

            // If the target element is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If the target element is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, the element was not present
        return -1;
    }
}
