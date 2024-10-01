package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger base = BigInteger.ZERO;
        BigInteger power = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("please insert ints");

        base = BigInteger.valueOf(sc.nextInt());
        power = BigInteger.valueOf(sc.nextInt());


        for (int i = 1; i <= power.intValue(); i++) {
            result = result.multiply(base);
        }
        System.out.printf("%d ^ %d = %,d", base, power, result);
    }
}
