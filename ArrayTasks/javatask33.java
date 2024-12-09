33.Program to sort an array in desending order

public class Main {
    public static void main(String[] args) {
        // Define an array to be sorted in descending order
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Print the original array
        System.out.println("Original Array:");
        printArray(array);

        // Sort the array in descending order
        bubbleSortDescending(array);

        // Print the sorted array
        System.out.println("Sorted Array in Descending Order:");
        printArray(array);
    }

    // Method to perform bubble sort in descending order on the array
    public static void bubbleSortDescending(int[] array) {
        int n = array.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element found is smaller than the next element
                if (array[j] < array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
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


