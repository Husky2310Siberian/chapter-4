package gr.aueb.cf.ch4;

/**
 * demo of surrogate pairs
 */
public class UnicodeApp {

    public static void main(String[] args) {
        int smiley = 0x1F600;   //utf-8 smiley
        System.out.println("smiley: \uD83D\uDE00");

        System.out.println("smiley: ");
        System.out.println(Character.toChars(smiley));
    }
}
