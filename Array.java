import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] rows;
        rows = new int[7];

        System.out.println(rows[4]); 
        // it prints the 0 as output
        // because it internally stores as [0,0,0,0,0,0,0]

        String[] arr = new String[5];
        System.out.println(arr[2]);
        //it prints null as output 
    }
}


//input using for loop
import java.util.Scanner;
import java.util.ArrayList;

public class Array {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}


//by using for each loop
import java.util.Scanner;
import java.util.ArrayList;

public class Array {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for(int num : arr) {
            System.out.println(num+" ");
        }
    }
}


//by using Arrays.toString
import java.util.Arrays;
import java.util.Scanner;

public class Array
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    int i;
	    
	    String[] str = new String[4];
	    for(i=0; i<str.length; i++){
	        str[i] = in.next();
	    }
	    System.out.println(Arrays.toString(str));
    }
}