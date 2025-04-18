import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = in.nextInt();
        int original = num;
        int res = 0;
        while(num>0) {
            int rem = num%10;
            num = num/10;
            res = res*10 + rem;
        }
        if(original == res) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}

