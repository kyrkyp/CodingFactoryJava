package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IOWritterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/test.txt");
            PrintWriter pw = new PrintWriter("C:/tmp/test.txt")) {
            ps.println("Hello Coding");
            pw.println("Hello Coding");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
