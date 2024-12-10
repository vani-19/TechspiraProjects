73.Program to check if a number is prime

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle edge case for numbers less than 2
        if (number <= 1) {
            return false;
        }

        // Handle the case for 2, the only even prime number
        if (number == 2) {
            return true;
        }

        // Eliminate even numbers greater than 2
        if (number % 2 == 0) {
            return false;
        }

        // Check odd numbers from 3 to sqrt(number)
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }

        // If no divisor was found, it's prime
        return true;
    }
}
