/*variable length arguments means when we dont know how many arguments to give then we give as int...a or string...v or char...variable
means variable length is not constant it varies
it stores values as arrays*/

/*Rules for varargs:
 1.There can be only one variable argument in the method.
 2.Variable argument (varargs) must be the last argument.
ex: int a, String ...v,int b is wrong because we don't know when b is going to Come*/ 


import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun1(7,6,8,5,4,2,3);
        fun2("Prasanna","Srinu","venkat","Anji");
        fun3(7,5,"sita","ramya","geetha");
    }

    public static void fun1(int...v) {
        System.out.println(Arrays.toString(v));
        
    }

    public static void fun2(String...a) {
        System.out.println(Arrays.toString(a));
    }

    public static void fun3(int a,int b,String...v) {
        System.out.println(Arrays.toString(v));
        System.out.println("a = " + a + ", b = " + b);

    }
}






