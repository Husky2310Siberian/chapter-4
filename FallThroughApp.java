package gr.aueb.cf.ch4;
/**
 * insert the grade and take back feedback
 * for your performance
 */

import java.util.Scanner;

public class FallThroughApp {

    public static void main(String[] args) {
        int grade = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("please insert your grade");
        grade = in.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("no grade");
                break;
            case 5:
            case 6:
                System.out.println("good");
                break;
            case 7:
            case 8:
                System.out.println("very good");
                break;
            case 9:
            case 10:
                System.out.println("excellent");
                break;
            default:
                System.out.println("insert a grade between 0-10");
                break;
        }
    }
}
