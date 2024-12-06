7. Print Array Second half reverse direction

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // Calculate the midpoint of the array
        int mid = arr.length / 2;

        // Loop through the second half of the array in reverse order and print elements
        for (int i = arr.length - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}