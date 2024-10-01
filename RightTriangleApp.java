package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * the user insert three decimals numbers , tha represent the sides
 * of a triangle, the program checks if the triangle is right(ορθογώνιο)
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a = 0.0; // υποτείνουσα
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;

        System.out.println("Please insert the numbers");
        a = sc.nextDouble();
        b= sc.nextDouble();
        c = sc.nextDouble();

        isRight =  Math.abs(a*a - b*b - c*c) <= EPSILON;
            System.out.println("THE TRIANGLE IS RIGHT: " + isRight);
    }
}
