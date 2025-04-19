import java.util.Arrays;

public class ReverseArray {

    // Method to reverse the array
    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        reverse(arr);

        System.out.println("\n\nReversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
