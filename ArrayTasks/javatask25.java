25. Program to check if an array is sorted

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize and input the array elements
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array is sorted in ascending order
        boolean isAscending = true;
        for (int i = 1; i < size; i++) {
            if (array[i] < array[i - 1]) {
                isAscending = false;
                break;
            }
        }

        // Check if the array is sorted in descending order
        boolean isDescending = true;
        for (int i = 1; i < size; i++) {
            if (array[i] > array[i - 1]) {
                isDescending = false;
                break;
            }
        }

        // Output the result
        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array is not sorted.");
        }

        // Close the scanner
        scanner.close();
    }
}
