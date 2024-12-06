4.Program to print all Even position elements

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {  // Even index condition
                System.out.print(arr[i] + " ");
            }
        }
    }
}
