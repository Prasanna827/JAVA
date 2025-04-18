// values initialized outside block cannot be initialized again but they can be updated.

// values initialized inside block cannot accessed from outside because it doesn't know the existance like c variable line 29

// values initialized inside block,can also initialise outside block because it doesn't know whether it is there or not as line 27.

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "prasanna";
        System.out.println(name);
        {
            //a is already initialised outside the block in the same method, hence you cannot initialise again
            // reassign the origin ref variable to some other value

            a = 40; // value a updated to 40
            System.out.println(a);
            int c = 65;
            //name = "Lakshmi"; // name updated to lakshmi
            System.out.println(c);
            System.out.println(name);
            // values initialised in this block, will remain in block but updated values can be accessed from outside block

        }

        int c = 87;
        System.out.println(a); // prints updated a value not initialized value
        System.out.println(name); 
        System.out.println(c); //it prints 87 not 65
    }
}