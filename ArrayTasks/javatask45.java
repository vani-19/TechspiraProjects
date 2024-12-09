45.Program to find the union of two arrays

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Call the method to find and print the union of the two arrays
        System.out.println("Union of the two arrays:");
        findUnion(array1, array2);
    }

    // Method to find and print the union of two arrays
    public static void findUnion(int[] array1, int[] array2) {
        // Create a HashSet to store the union of elements (removes duplicates)
        HashSet<Integer> unionSet = new HashSet<>();

        // Add elements from the first array to the HashSet
        for (int i = 0; i < array1.length; i++) {
            unionSet.add(array1[i]);
        }

        // Add elements from the second array to the HashSet
        for (int i = 0; i < array2.length; i++) {
            unionSet.add(array2[i]);
        }

        // Print the elements of the union (unique elements from both arrays)
        for (int element : unionSet) {
            System.out.print(element + " ");
        }
    }
}
