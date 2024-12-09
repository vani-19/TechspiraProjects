23. Program to find the smallest element in an array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner to read input from the keyboard
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

        // Initialize smallest element as the first element in the array
        int smallest = array[0];

        // Loop through the array to find the smallest element
        for (int i = 1; i < size; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Output the smallest element
        System.out.println("The smallest element in the array is: " + smallest);

        // Close the scanner
        scanner.close();
    }
}
