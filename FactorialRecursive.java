package gr.aueb.cf.ch4;

/**
 * recursive version of factorial
 */
public class FactorialRecursive {

    public static void main(String[] args) {    //main demands to find n!
        int n = 4;

        System.out.println("Facto: " + factorial(n));
    }

    public static int factorial(int n) { //method facto returns the result of n!
        if (n <= 1)  {
               return 1;
      } else {
    return n * factorial(n-1);
    }

   // return  (n <= 1) ? 1 : n * facto(n-1) ;
    }
}
