75.Program to Reverse a Number

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number to be reversed
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        // Call the function to reverse the number and store the result
        int reversedNumber = reverseNumber(number);

        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to reverse the digits of a number
    public static int reverseNumber(int number) {
        int reversed = 0;

        // Handle negative numbers by storing the sign
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;  // Make the number positive for the reversal
        }

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;          // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            number = number / 10;             // Remove the last digit
        }

        // If the number was negative, make the reversed number negative as well
        if (isNegative) {
            reversed = -reversed;
        }

        return reversed;
    }
}
