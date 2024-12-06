12. Program to print the sum of array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5};
        
        // Variable to store the sum
        int sum = 0;
        
        // Loop through the array and calculate the sum
        for (int num : arr) {
            sum += num;
        }
        
        // Print the sum of the array
        System.out.println("Sum of the array: " + sum);
    }
}