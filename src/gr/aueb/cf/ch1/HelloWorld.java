package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;

import java.util.Scanner;
import static java.lang.Math.abs;

/**
 * Prints <b>Hello World!</b> in
 * standard output (console).
 *Defines a {@link HelloWorld} type
 *
 * @author KyriakosKypraios
 * @version 1.1
 * @since 0.1
 */
public class HelloWorld {
    private Scanner sc = new Scanner(System.in);
    private Point point;
    private String s;

    public static void main(String[] args) {
        int abs = abs(-3);
        System.out.println("Hello World!");
    }
}

