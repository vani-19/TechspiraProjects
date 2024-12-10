62. Program to Find the Sum of Odd and Even Numbers in an Array 

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Variables to hold the sum of even and odd numbers
        int evenSum = 0;
        int oddSum = 0;

        // Loop through the array to calculate the sums
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenSum += array[i];  // Add to even sum if the number is even
            } else {
                oddSum += array[i];   // Add to odd sum if the number is odd
            }
        }

        // Output the results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
