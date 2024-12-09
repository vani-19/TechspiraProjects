46.Program to find the intersection of two arrays

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Call the method to find and print the intersection of the two arrays
        System.out.println("Intersection of the two arrays:");
        findIntersection(array1, array2);
    }

    // Method to find and print the intersection of two arrays
    public static void findIntersection(int[] array1, int[] array2) {
        // Create a HashSet to store the elements of array1 (for faster lookup)
        HashSet<Integer> set = new HashSet<>();
        
        // Add all elements from array1 to the HashSet
        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }

        // Iterate through array2 and check if any element is present in the HashSet
        // If yes, it's a common element (intersection)
        for (int i = 0; i < array2.length; i++) {
            if (set.contains(array2[i])) {
                System.out.print(array2[i] + " ");  // Print the common element
                set.remove(array2[i]); // To ensure each element is printed only once
            }
        }
    }
}
