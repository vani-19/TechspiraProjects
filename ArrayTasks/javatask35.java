35. Program to check if a number is present in an array

public class Main {
    public static void main(String[] args) {
        // Define an array and the number to search
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberToFind = 5;

        // Check if the number is present in the array
        boolean isPresent = isNumberPresent(array, numberToFind);

        // Output the result
        if (isPresent) {
            System.out.println("The number " + numberToFind + " is present in the array.");
        } else {
            System.out.println("The number " + numberToFind + " is not present in the array.");
        }
    }

    // Method to check if the number is present in the array
    public static boolean isNumberPresent(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;  // Number found, return true
            }
        }
        return false;  // Number not found, return false
    }
}
