Find the maximum number of arrays

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 5, 20, 2, 8};

        // Check if the array is empty
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Assume the first element is the maximum
        int max = arr[0];

        // Loop through the array to find the maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger value is found
            }
        }

        // Print the maximum value
        System.out.println("Maximum value in the array: " + max);
    }
}