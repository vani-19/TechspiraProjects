39.Program to find the index of the largest element in an array

public class Main {
    public static void main(String[] args) {
        // Define the array
        int[] array = {10, 20, 35, 5, 40, 25, 30};

        // Call the method to find the index of the largest element
        int largestIndex = findLargestIndex(array);

        // Output the result
        if (largestIndex != -1) {
            System.out.println("The largest element is at index: " + largestIndex);
        } else {
            System.out.println("Array is empty.");
        }
    }

    // Method to find the index of the largest element in the array
    public static int findLargestIndex(int[] array) {
        if (array.length == 0) {
            return -1; // If the array is empty, return -1
        }

        int largestIndex = 0; // Start by assuming the first element is the largest

        // Iterate through the array to find the index of the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largestIndex]) {
                largestIndex = i; // Update largest index if we find a larger element
            }
        }

        return largestIndex; // Return the index of the largest element
    }
}
