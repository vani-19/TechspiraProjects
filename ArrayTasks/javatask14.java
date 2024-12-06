14. Program to print  the sum and average of the right of an array 

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // Check if the array is empty
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return; // Exit if the array is empty
        }

        // Calculate the starting index of the right half
        int startIndex = arr.length / 2;

        // Variable to store the sum of the right half
        int sum = 0;

        // Loop through the right half of the array and calculate the sum
        for (int i = startIndex; i < arr.length; i++) {
            sum += arr[i];
        }

        // Calculate the average of the right half
        double average = (double) sum / (arr.length - startIndex);

        // Print the sum and the average of the right half
        System.out.println("Sum of the right half: " + sum);
        System.out.println("Average of the right half: " + average);
    }
}