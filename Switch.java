import java.util.Scanner;

public class Switch
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.println("Enter Fruit Name: ");
        String fruit = in.next();
	
		switch(fruit) {
		    case "mango" -> System.out.println("king of fruits");
		    case "apple" -> System.out.println("small red coloured");
		    case "banana" -> System.out.println("halfmoon shaped");
		    case "grape" -> System.out.println("green cherry");
		    default -> System.out.println("Enter correct fruit");
	    }
	}
}

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter empID: ");
        int empID = in.nextInt();
        System.out.println("Enter department: ");
        String department = in.next();

     
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
