package gr.aueb.cf.ch4;

/**
 * generic form of for
 */
import java.util.Scanner;
public class GenericFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step =0 ;
        int iterations = 0;

        System.out.println("Please insert, start value, end value and step");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i=1; i<=endValue; i = step + i) {
            iterations++;
            System.out.println(i);
        }
        System.out.println();
        System.out.println("iterations:" + iterations);
    }
}
