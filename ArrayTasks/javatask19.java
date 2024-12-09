19.Program to swap 2 array elements

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize and populate the array
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Get the indices of elements to swap
        System.out.print("Enter index of the first element to swap: ");
        int index1 = scanner.nextInt();

        System.out.print("Enter index of the second element to swap: ");
        int index2 = scanner.nextInt();

        // Swap elements at the given indices
        if (index1 >= 0 && index1 < size && index2 >= 0 && index2 < size) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;

            // Print the array after the swap
            System.out.println("Array after swapping:");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Invalid indices.");
        }

        // Close the scanner
        scanner.close();
    }
}
