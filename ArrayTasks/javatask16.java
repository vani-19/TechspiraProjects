Find the minimum number of the array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 5, 20, 2, 8};

        // Check if the array is empty
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Assume the first element is the minimum
        int min = arr[0];

        // Loop through the array to find the minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller value is found
            }
        }

        // Print the minimum value
        System.out.println("Minimum value in the array: " + min);
    }
}