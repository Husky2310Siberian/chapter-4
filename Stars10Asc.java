package gr.aueb.cf.ch4;

/**
 * prints 10 rows of stars in ascending form
 * 1 row -> 1 star
 * 2 row -> 2 stars
 */
public class Stars10Asc {

    public static void main(String[] args) {
        for (int i= 1; i<=3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
