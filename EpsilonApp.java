package gr.aueb.cf.ch4;

public class EpsilonApp {

    public static void main(String[] args) {

        final double EPSILON  = 0.000005;
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i<=10; i++){
            actual += 0.1;
        }

        System.out.printf("Actual is %.20f \n" ,actual);
        System.out.printf("Expected is %.20f \n" ,expected);


        if (Math.abs(actual - expected) <= EPSILON) {
            System.out.println("EQUALS");
        }   else {
            System.out.println("NOT EQUALS");
        }


    }
}
