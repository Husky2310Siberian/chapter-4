package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * checks if a number is Odd or Even using a method
 */

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;


        System.out.println("please insert the number");
        inputNum = in.nextInt();

        System.out.printf("%d is even : %b \n ", inputNum , isEven(inputNum));
        System.out.printf("%d is odd : %b ", inputNum , !isEven(inputNum));
    }

    /**
     * evaluates if an input is even
     * @param a the input int
     * @return true if is even, false otherwise
     */
    public static boolean isEven(int a){
        return a % 2 == 0;
    }
}
