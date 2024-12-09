43.Program to swap two elements in an array

public class Main {
    public static void main(String[] args) {
        // Define the array
        int[] array = {10, 20, 30, 40, 50};

        // Print original array
        System.out.println("Original Array:");
        printArray(array);

        // Indices of elements to swap
        int index1 = 1; // Index of element 20
        int index2 = 3; // Index of element 40

        // Swap the elements at index1 and index2
        swapElements(array, index1, index2);

        // Print modified array
        System.out.println("Array after swapping:");
        printArray(array);
    }

    // Method to swap elements in the array
    public static void swapElements(int[] array, int index1, int index2) {
        // Swap logic
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // For a new line after printing the array
    }
}
