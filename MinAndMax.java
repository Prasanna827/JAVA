import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element is: " + max);

        for(int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element is: " + min);
    }
}