package gr.aueb.cf.ch4;

/**
 * adds two numbers using method (this is structured programming)
 */

public class AddApp {
    public static void main(String[] args) {
    int a = 10;
    int b =10;
    int result = 0;

    result = add(a , b);    // the full name of method add is AddAppadd
        System.out.println("result is: " + result);
    }

    /**
     * adds two integres
     * @param a1 the first integer
     * @param b1 the second integer
     * @return the sum of integer
     */

    public static int add ( int a1 , int b1){   //a + b  (add) are different integers from a + b (main)
        //  int result = 0;
        // result = a + b;
        // return result;

     return a1 + b1 ;
    }
}
