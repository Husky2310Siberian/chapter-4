package gr.aueb.cf.ch4;

public class DeclarationApp {

    public static void main(String[] args) {

        float f = 3.5f;
        double d = 14.8;
        float age = 5F;
        double price = 19D;
        final float LIGHT_SPEED = 3.0E5F;
        final double PI = 3.1415;

        long intNum = 10;
        float floatNum = 0.8F;
        double doubleNum = 12.8;

        float resultFloat = 0;
        double resultDouble = 0;

        resultFloat = floatNum + intNum;            // int,long , short, byte promotes to float
        resultDouble = doubleNum + floatNum + intNum;

        System.out.printf("result float : %6.2f\t%e\t%g\n", resultFloat , resultFloat, resultFloat);
        System.out.printf("result double : %8.3f ", resultDouble);
    }
}