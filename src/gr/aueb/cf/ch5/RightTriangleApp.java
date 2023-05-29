package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές από το χρήστη, τις
 * a, b, c όπου α είναι η υποτείνουσα και
 * b, c οι δύο πλευρές. Ελέγχει αν το
 * τρίγωνο είναι ορθογώνιο. Δλδ α^2 == b^2 + c^2
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please insert a");
        a = in.nextDouble();

        System.out.println("Please insert b");
        b = in.nextDouble();

        System.out.println("Please insert c");
        c = in.nextDouble();

        isRight = Math.abs(a*a - b*b - c*c) <= EPSILON;

        if (isRight) {
            System.out.println("Είναι ορθογώνιο");
        } else {
            System.out.println("Δεν είναι ορθογώνιο");
        }
    }
}
