60.Program to Find the Second Largest Element in an Array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // If the number of elements is less than 2, second largest doesn't exist
        if (n < 2) {
            System.out.println("Array must have at least two elements.");
            scanner.close();
            return;
        }

        // Initialize the array
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the second largest element
        int secondLargest = findSecondLargest(array);

        // Output the second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to find the second largest element in the array
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = array[i];       // Update largest
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i]; // Update second largest if current element is less than largest
            }
        }

        return secondLargest;
    }
}
