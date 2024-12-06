15. Program to print sum and average of left (first half) array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // Check if the array is empty
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return; // Exit if the array is empty
        }

        // Calculate the middle index to divide the array into two halves
        int midIndex = arr.length / 2;

        // Variable to store the sum of the left half
        int sum = 0;

        // Loop through the left half of the array and calculate the sum
        for (int i = 0; i < midIndex; i++) {
            sum += arr[i];
        }

        // Calculate the average of the left half
        double average = (double) sum / midIndex;

        // Print the sum and the average of the left half
        System.out.println("Sum of the left half: " + sum);
        System.out.println("Average of the left half: " + average);
    }
}