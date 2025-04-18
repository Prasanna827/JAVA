import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = in.nextInt();
        int rem = 0;

        int even_count = 0;
        int odd_count = 0;
        while(num>0) {
            rem = num%10;

        if(rem%2 == 0) {
            even_count++;
        } 
        if(rem%2 != 0) {
            odd_count++;
        }
        num = num/10;
    }
        System.out.println("Even number count is:" + even_count);
        System.out.println("Odd number count is: " + odd_count);
            
    }
}