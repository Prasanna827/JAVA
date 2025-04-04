import java.util.Scanner;

public class Reverrse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = in.nextInt();

        int rem,result;

        result = 0;

        while(num>0) {
            rem = num %10;
            num /= 10;
            result = result * 10 + rem;
        }
        System.out.println("Reverse of Number: " + result);
    }
}