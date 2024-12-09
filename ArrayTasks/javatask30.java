30. Program to find the second largest element in an array

public class Main {
    public static void main(String[] args) {
        // Define an array
        int[] array = {12, 35, 1, 10, 34, 1};

        // Find the second largest element
        int secondLargest = findSecondLargest(array);

        // Print the second largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }

    // Method to find the second largest element
    public static int findSecondLargest(int[] array) {
        // Edge case: if the array has less than two elements
        if (array.length < 2) {
            return Integer.MIN_VALUE;  // Indicating no second largest element
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the largest and second largest
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;  // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;  // Update second largest
            }
        }

        return secondLargest;
    }
}
