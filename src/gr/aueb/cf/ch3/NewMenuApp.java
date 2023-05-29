package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NewMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println("Παρακαλώ επιλέξτε μια επιλογή: ");

            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Μη έγκυρη επιλογή");
            }

            if (choice == 5) {
                System.out.println("Επιλέξατε έξοδο");
            }

            if (choice == 1) {
                System.out.println("Επιλέξατε εισαγωγή");
            } else if (choice == 2) {
                System.out.println("2. Διαγραφή");
            } else if (choice == 3) {
                System.out.println("2. Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("2. Αναζήτηση");
            }
        } while (choice != 5);
    }

}
