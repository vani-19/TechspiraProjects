3. Program to print all ODD position elements

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        
        // Loop through the array with 1-based indexing for odd positions
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 != 0) {  // Check for odd positions
                System.out.print(array[i] + " ");
                
            }
}
}
}