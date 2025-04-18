import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        String[] arr = {"venkat","srinu","anji","bajarangi","venkat","anji","venkat"};

        boolean flag = false;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate Element found is: "+arr[i]);
                    flag = true;
                }
            }
        }

        if(flag == false) {
            System.out.println("Duplicate Element not found");
        }
    }
}
