2.Print the second half of an Array

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;

        // Loop through the second half of the array
        for (int i = n / 2; i < n; i++) {
            System.out.print(array[i] + " ");
}
}
}
