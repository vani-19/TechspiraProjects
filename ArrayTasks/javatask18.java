18.Program to replace any element within array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner to get input
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create and input array elements
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get element to replace and the new value
        System.out.print("Enter the element to replace: ");
        int oldElement = scanner.nextInt();
        System.out.print("Enter the new element: ");
        int newElement = scanner.nextInt();

        // Replace the element
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
                found = true;
                break; // Replace only the first occurrence
            }
        }

        // Output the modified array
        if (found) {
            System.out.println("Array after replacement:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Element " + oldElement + " not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
