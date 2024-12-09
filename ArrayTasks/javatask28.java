28. Program to Rotate an Array by a given Number of positions

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define the array and the number of positions to rotate
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 3; // Number of positions to rotate the array

        // Print the original array
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));

        // Rotate the array
        rotateArray(array, positions);

        // Print the rotated array
        System.out.println("Array after rotating by " + positions + " positions:");
        System.out.println(Arrays.toString(array));
    }

    // Method to rotate the array by the given number of positions
    public static void rotateArray(int[] array, int positions) {
        int n = array.length;
        // If positions is greater than array length, reduce it to prevent extra rotations
        positions = positions % n;

        // Step 1: Reverse the entire array
        reverseArray(array, 0, n - 1);

        // Step 2: Reverse the first part (from 0 to positions-1)
        reverseArray(array, 0, positions - 1);

        // Step 3: Reverse the second part (from positions to n-1)
        reverseArray(array, positions, n - 1);
    }

    // Method to reverse a portion of the array between two indices
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
