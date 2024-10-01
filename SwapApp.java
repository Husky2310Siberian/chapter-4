package gr.aueb.cf.ch4;

/**
 * mutually interchanges the value of two integers (does not achieved the result!!!!)
 */

public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a:%d , b:%d \n",  a , b);
        swap(a,b);
        System.out.printf("a: %d , b:%d ",  a , b);
    }

    /**
     * mutually intercanges the two values of two integers
     *
     * @param a the first int
     * @param b the second int
     */
    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
    }
}
