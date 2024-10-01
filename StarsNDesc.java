package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * you insert a n number and prints stars (in descending mode)
 */
public class StarsNDesc {

    public static void main(String[] args) {

        int n = 1;
        Scanner sc  = new Scanner(System.in);

        System.out.println("Please insert the number");
        n = sc.nextInt();

        for( int i = n; i > 0; i--){
            for( int j = 1; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
    }
}