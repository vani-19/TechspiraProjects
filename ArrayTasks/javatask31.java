31.Program to find the missing number in sequence

public class Main {
    public static void main(String[] args) {
        // Define the array with a missing number
        int[] array = {1, 2, 4, 5, 6}; // The missing number is 3

        // Find the missing number
        int missingNumber = findMissingNumber(array);

        // Print the missing number
        System.out.println("The missing number is: " + missingNumber);
    }

    // Method to find the missing number in the array
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;  // The number of elements in the full sequence
        int expectedSum = n * (n + 1) / 2;  // Sum of first n natural numbers
        int actualSum = 0;

        // Calculate the sum of the elements in the array
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;
    }
}
