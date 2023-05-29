package gr.aueb.cf.ch4;

/**
 * ΣΕ φθίνουσα σειρά
 */
public class Stars10Descending {

    public static void main(String[] args) {
        for (int i =1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
