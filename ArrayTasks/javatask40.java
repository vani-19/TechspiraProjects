40.Program to find the index of the smallest element in an array

public class Main {
    public static void main(String[] args) {
        // Define the array
        int[] array = {10, 20, 35, 5, 40, 25, 30};

        // Call the method to find the index of the smallest element
        int smallestIndex = findSmallestIndex(array);

        // Output the result
        if (smallestIndex != -1) {
            System.out.println("The smallest element is at index: " + smallestIndex);
        } else {
            System.out.println("Array is empty.");
        }
    }

    // Method to find the index of the smallest element in the array
    public static int findSmallestIndex(int[] array) {
        if (array.length == 0) {
            return -1; // If the array is empty, return -1
        }

        int smallestIndex = 0; // Start by assuming the first element is the smallest

        // Iterate through the array to find the index of the smallest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i; // Update smallest index if we find a smaller element
            }
        }

        return smallestIndex; // Return the index of the smallest element
    }
}
