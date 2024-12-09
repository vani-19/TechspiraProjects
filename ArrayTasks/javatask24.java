24.Program to count the occurrence of each element in an array

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create and input array elements
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Create a HashMap to store element counts
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count the occurrences of each element
        for (int i = 0; i < size; i++) {
            countMap.put(array[i], countMap.getOrDefault(array[i], 0) + 1);
        }

        // Print the count of each element
        System.out.println("Occurrences of each element:");
        for (int key : countMap.keySet()) {
            System.out.println(key + " occurs " + countMap.get(key) + " times.");
        }

        // Close the scanner
        scanner.close();
    }
}
