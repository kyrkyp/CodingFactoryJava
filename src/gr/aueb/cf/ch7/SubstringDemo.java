package gr.aueb.cf.ch7;

public class SubstringDemo {
    public static void main(String[] args) {
        String a = "Athens Uni of Economics and Sub";

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.substring(i, i + 1));
        }

        System.out.println();

        for (int i = a.length() - 1; i >= 0; i--){
            System.out.println(a.charAt(i));
        }
    }
}
