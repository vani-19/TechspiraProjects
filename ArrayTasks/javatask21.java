21.Initialize array at the time of declaration.

public class Main {
    public static void main(String[] args) {
        // Initialize an array at the time of declaration with values
        int[] array = {10, 20, 30, 40, 50};

        // Print the array elements
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
