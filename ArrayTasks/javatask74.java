74. Program to generate Fibonacci Series

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Generate and print the Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");
        generateFibonacci(n);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to generate the Fibonacci series up to n terms
    public static void generateFibonacci(int n) {
        // Handle edge case where n <= 0
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // First two terms are 0 and 1
        int a = 0, b = 1;

        // Print the first term if n >= 1
        if (n >= 1) {
            System.out.print(a + " ");
        }

        // Print the second term if n >= 2
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Print the rest of the Fibonacci series
        for (int i = 3; i <= n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");

            // Update a and b for the next iteration
            a = b;
            b = nextTerm;
        }
        
        System.out.println();  // For a newline after printing the series
    }
}
