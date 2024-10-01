package gr.aueb.cf.ch4;

import java.util.Scanner;
/**
 * you insert a n number and prints stars (in horizontal mode and vertical number)
 */
public class HVnStarsExercise {

    public static void main(String[] args) {
        int n = 0;
        int result = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert the number");
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
    }
}
