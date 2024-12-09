22. Program to Find the largest element in an array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create and input array elements
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize largest element as the first element in the array
        int largest = array[0];

        // Loop through the array to find the largest element
        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
