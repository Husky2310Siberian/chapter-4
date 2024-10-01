package gr.aueb.cf.ch4;

/**
 * prints the words CF forever until counter counters 100 iterations
 */
public class InternalFor {

    public static void main(String[] args) {
        int counter = 0;

        for (; ; ) {
            System.out.println("CF forever");
            counter++;

            if (counter % 10 == 0){
                System.out.println();
            }
            if(counter == 30){
                break;
            }
        }
    }
}