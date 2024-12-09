38.Program to implement Linear Search

public class Main {
    public static void main(String[] args) {
        // Define an array to search
        int[] array = {10, 20, 30, 40, 50, 60, 70};

        // Define the number to search for
        int target = 40;

        // Call linearSearch method
        int result = linearSearch(array, target);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Method to perform linear search on an array
    public static int linearSearch(int[] array, int target) {
        // Traverse through the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found, return -1
    }
}
