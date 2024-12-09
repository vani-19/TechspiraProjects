41. Program to print the frequency of each element is an array

public class Main {
    public static void main(String[] args) {
        // Define an array
        int[] array = {10, 20, 10, 30, 20, 20, 40};

        // Call the method to print frequencies
        printFrequencies(array);
    }

    // Method to print the frequency of each element in the array
    public static void printFrequencies(int[] array) {
        // Check if the array is empty
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Traverse the array to print the frequency of each element
        for (int i = 0; i < array.length; i++) {
            // If the element is already visited, skip it
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            // If the element was not counted before, count its frequency
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < array.length; k++) {
                    if (array[i] == array[k]) {
                        count++;
                    }
                }
                // Print the frequency of the element
                System.out.println("Element " + array[i] + " appears " + count + " times.");
            }
        }
    }
}
