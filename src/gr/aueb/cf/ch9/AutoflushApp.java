package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoflushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("c:/tmp/f1.txt",true), true, StandardCharsets.UTF_8)) {
            ps.println("Καλησπέρα");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
