29. Program to reverse an array without using another array

public class Main {
    public static void main(String[] args) {
        // Define the array
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Reverse the array in place
        reverseArray(array);

        // Print the reversed array
        System.out.println("Reversed Array:");
        printArray(array);
    }

    // Method to reverse the array in place
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap elements from start to end until they meet in the middle
        while (start < end) {
            // Swap array[start] and array[end]
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
