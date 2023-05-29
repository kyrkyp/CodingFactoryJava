package gr.aueb.cf.ch2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class  Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Δώστε τη θερμοκρασία σε βαθμούς Fahrenheit: ");
        int fahrenheit = input.nextInt();

        double celsius = 5 * (fahrenheit - 32) / 9.0;
        DecimalFormat decimalFormat = new DecimalFormat("#");

        System.out.println("Η θερμοκρασία σε βαθμούς Celsius είναι: " + decimalFormat.format(celsius) + "\u2103");
    }
}
