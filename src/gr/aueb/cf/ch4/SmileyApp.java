package gr.aueb.cf.ch4;

/**
 * Prints a smiley
 */
public class SmileyApp {


    public static void main(String[] args) {
        int codePoint = 0x1F600;

        // Surrogate pair
        System.out.println("Smiley: \ud83d\ude00");
    }
}
