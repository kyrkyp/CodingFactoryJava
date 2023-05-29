package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το a^n με BigInteger
 */
public class BigIntPowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a;
        // int a;
        BigInteger n;
        // int n;
        BigInteger result = new BigInteger("1");

        System.out.println("Please insert two ints, base and power");
        a = BigInteger.valueOf(in.nextInt());
        // a = in.nextInt();
        n = BigInteger.valueOf(in.nextInt());
        // n = in.nextInt();

        // for (int i = 1; i <= n; i++)
        for (int i = 1; i <= n.intValue(); i++) {
            // result = result.multiply(BigInteger.valueOf(a));
            result = result.multiply(a);
        }

        System.out.printf("%d^%d = %d", a, n, result);
    }
}
