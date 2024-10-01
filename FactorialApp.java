package gr.aueb.cf.ch4;
import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        int a = 1;
        int b = 1;
        System.out.println("Please insert the number \n");
        n = in.nextInt();
        System.out.printf("%d! = %d \n", n , facto(n));
        System.out.println("Please insert the number \n");

        a = in.nextInt();
        b = in.nextInt();
        System.out.printf("%d ^ %d = %d ", a , b, pow(a,b));
    }

    /**
     * iterative version of n!
     * @param n the input number
     * @return the factorial og n.
     */
    public static int facto(int n){

        int result = 1;

        for (int i = 1; i<=n; i++){
            result *= i;
        }
        return result;
    }

    /**
     * computes the power a ^ b
     * @param a the base
     * @param b the power
     * @return thw result of a^b
     */
    public static int pow(int a, int b){

        int power = 1;
        int result = 1;

        for(int i = 1; i <= b; i++){
            power *= a;
            result = power;
        }
        return result;
    }
}