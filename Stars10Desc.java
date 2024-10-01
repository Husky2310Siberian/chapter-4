package gr.aueb.cf.ch4;

/**
 * prints 10 rows of stars in descending form
 * 1 row -> 10 stars
 * 2 row -> 9 stars
 */
public class Stars10Desc {

    public static void main(String[] args) {
        for (int i= 10; i>=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
