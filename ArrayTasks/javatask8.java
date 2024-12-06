8. Print Array even positions in reverse order

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // Loop through the array and print elements at even positions in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {  // Check if the index is even
                System.out.print(arr[i] + " ");
            }
        }
    }
}