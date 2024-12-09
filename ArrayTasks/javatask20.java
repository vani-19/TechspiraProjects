20.Read the array values from the keyboard

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array based on the user input size
        int[] array = new int[size];

        // Read the array elements from the user
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array elements after reading them
        System.out.println("Array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
