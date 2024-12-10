56.Program to FInd the Missing Number in an Array (1 to n)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array (n-1, because one number is missing)
        System.out.print("Enter the number of elements in the array (n-1, as one number is missing): ");
        int nMinusOne = scanner.nextInt();

        // The total number of elements is n, so n = nMinusOne + 1
        int n = nMinusOne + 1;

        // Initialize the array
        int[] array = new int[nMinusOne];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < nMinusOne; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Calculate the sum of the elements in the array
        int actualSum = 0;
        for (int i = 0; i < nMinusOne; i++) {
            actualSum += array[i];
        }

        // The missing number is the difference between the expected sum and actual sum
        int missingNumber = expectedSum - actualSum;

        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
