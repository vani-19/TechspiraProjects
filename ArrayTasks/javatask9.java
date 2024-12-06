9.Print Array ODD positions in reverse order 

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // Loop through the array and print elements at odd positions in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i % 2 != 1) {  // Check if the index is odd
                System.out.print(arr[i] + " ");
            }
        }
    }
}