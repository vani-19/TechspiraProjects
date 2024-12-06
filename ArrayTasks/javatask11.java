11. Print middle values of an array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        // Check if the array has at least one element
        if (arr.length > 0) {
            int middle = arr.length / 2;
            
            // If the array has an odd number of elements, print the middle element
            if (arr.length % 2 != 0) {
                System.out.println("Middle element: " + arr[middle]);
            } else {
                // If the array has an even number of elements, print the two middle elements
                System.out.println("Middle elements: " + arr[middle - 1] + " and " + arr[middle]);
            }
        } else {
            System.out.println("Array is empty.");
        }
    }
}