package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * you insert a n number and prints stars (in vertical mode)
 */
public class StarsVericalExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        //int result = 0;

        System.out.println("Please insert the number");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //result += n;
            System.out.print(" * ");
        }
    }
}
