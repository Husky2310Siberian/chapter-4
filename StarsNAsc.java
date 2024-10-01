package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * you insert a n number and prints stars (in ascending mode)
 */
public class StarsNAsc {

    public static void main(String[] args) {

        int n = 1;
        Scanner sc  = new Scanner(System.in);

        System.out.println("Please insert the number");
        n = sc.nextInt();

        for( int i = 0; i < n; i++){
            for( int j = 0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
    }
}
