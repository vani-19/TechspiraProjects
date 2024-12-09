27. Program to Remove Duplicate Elements from an Array

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Define an array with duplicate values
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7};

        // Use a HashSet to automatically remove duplicates
        Set<Integer> uniqueSet = new HashSet<>();

        // Add each element of the array to the HashSet
        for (int num : array) {
            uniqueSet.add(num);
        }

        // Convert the HashSet back to an array
        Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);

        // Print the array with duplicates removed
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
