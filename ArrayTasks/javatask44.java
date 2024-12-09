43. Program to find the common elements between two arrays

public class Main {
    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        // Call the method to find common elements
        System.out.println("Common elements between the two arrays:");
        findCommonElements(array1, array2);
    }

    // Method to find and print common elements between two arrays
    public static void findCommonElements(int[] array1, int[] array2) {
        // Iterate over the first array
        for (int i = 0; i < array1.length; i++) {
            // Check if the current element in array1 exists in array2
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " "); // Print the common element
                    break; // No need to check further once a match is found
                }
            }
        }
    }
}
