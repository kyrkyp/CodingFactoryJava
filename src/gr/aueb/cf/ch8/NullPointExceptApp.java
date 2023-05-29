package gr.aueb.cf.ch8;

public class NullPointExceptApp {
    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            if (s.equals("Coding")) {
                System.out.println("Bingo");
            } else {
                System.out.println(" ");
            }
        } else {
        System.out.println(" is null");
        }
    }
}
