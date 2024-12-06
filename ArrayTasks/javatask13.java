13. Program to print sum and average of an array

public class Main {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 2, 3, 4, 5};
        
        // Variable to store the sum
        int sum = 0;
        
        // Loop through the array to calculate the sum
        for (int num : arr) {
            sum += num;
        }
        
        // Calculate the average
        double average = (arr.length > 0) ? (double) sum / arr.length : 0;
        
        // Print the sum and the average
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
}