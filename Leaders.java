import java.util.Scanner;

public class Leaders {

    public static void printLeaders(int[] arr) {
        int n = arr.length;

        System.out.println("Leaders in array: ");

        int maxFromRight = arr[n-1];
        System.out.println(maxFromRight + " ");

        for(int i=n-2; i>=0; i--) {
            if(arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.println(maxFromRight + " ");
            }
        }

        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = {7,9,5,3,6,4};
        printLeaders(arr);
    }
}