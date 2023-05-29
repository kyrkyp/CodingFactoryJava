package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\rmp\\random-file.txt");
        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException e2) {
            //e2.printStackTrace();
            System.out.println("File not found");
        }  catch (IOException e1) {
            //e1.printStackTrace();
            System.out.println("Read Error");
        } catch (Exception e3) {
            System.out.println("Ooooops something went wrong!");
        }
    }
}
