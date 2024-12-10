72. Program to find the pair with the given sum in an array

import java.util.Scanner;
import java.util.HashSet;

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
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Call the function to find the pair with the given sum
        if (findPairWithSum(array, target)) {
            System.out.println("Pair found!");
        } else {
            System.out.println("No pair found with the given sum.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to find a pair with the given sum
    public static boolean findPairWithSum(int[] array, int target) {
        // Create a HashSet to store the elements we've seen
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i]; // Calculate the complement

            // Check if the complement is already in the set
            if (seen.contains(complement)) {
                System.out.println("Pair: (" + array[i] + ", " + complement + ")");
                return true; // Pair found
            }

            // Add the current element to the set
            seen.add(array[i]);
        }

        // No pair found
        return false;
    }
}
