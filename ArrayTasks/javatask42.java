42.Program to check if an Array is palindrome

public class Main {
    public static void main(String[] args) {
        // Define the array
        int[] array = {1, 2, 3, 2, 1};

        // Call the method to check if the array is a palindrome
        if (isPalindrome(array)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    // Method to check if the array is a palindrome
    public static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;

        // Compare elements from both ends of the array
        while (left < right) {
            if (array[left] != array[right]) {
                return false; // If elements don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // All elements matched, it is a palindrome
    }
}
