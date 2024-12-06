5.Program to write array elements in reverse order

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Loop through the array in reverse order and print elements
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}