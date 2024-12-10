61. Program to check Two Arrays are Identical 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();

        // Initialize the first array
        int[] array1 = new int[n1];

        // Input the elements of the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input the number of elements in the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();

        // Initialize the second array
        int[] array2 = new int[n2];

        // Input the elements of the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Check if the arrays are identical
        if (areArraysIdentical(array1, array2)) {
            System.out.println("The arrays are identical.");
        } else {
            System.out.println("The arrays are not identical.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to check if two arrays are identical
    public static boolean areArraysIdentical(int[] array1, int[] array2) {
        // If the lengths are different, arrays are not identical
        if (array1.length != array2.length) {
            return false;
        }

        // Compare each corresponding element
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false; // Return false if any element is different
            }
        }

        return true; // Arrays are identical if we reach this point
    }
}
