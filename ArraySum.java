import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many elemnets to enter: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        System.out.println("Enter " + n + " elements");
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements is: " + sum);
    }
}