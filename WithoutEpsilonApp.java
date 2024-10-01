package gr.aueb.cf.ch4;

/**
 * decimal representation error
 */
public class WithoutEpsilonApp {
    public static void main(String[] args) {

        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <=10;  i++) {
            actual += 0.1;
        }

        System.out.println(actual);
        System.out.println(expected);

        if (actual == expected) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT EQUAL");
        }

    }
}
