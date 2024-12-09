26. Program to merge Two arrays

public class MergeArrays {

    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};

        // Create a new array to hold the merged result
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from array1 into mergedArray
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from array2 into mergedArray
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        // Print the merged array
        System.out.println("Merged Array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
