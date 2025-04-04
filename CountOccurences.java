import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,digit,count=0;

        System.out.println("Enter number: ");
        num = in.nextInt();

        System.out.println("Enter digit to count: ");
        digit = in.nextInt();

        while(num>0) {
            int rem = num % 10;
            if(rem == digit) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
} 