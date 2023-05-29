package gr.aueb.cf.ch10;

/**
 *
 */
public class CryptoJuliusCaesarApp {

    public static void main(String[] args) {

    }

    public static String encrypt(String s, int key) {
        StringBuilder enctypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)) enctypted.append(cipher(ch, key));
            else enctypted.append(ch);
        }

        return enctypted.toString();
    }

    public static String decrypt(String s, int key) {
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) decrypted.append(decipher(ch, key));
            else decrypted.append(ch);
        }

        return decrypted.toString();
    }

    public static char cipher(char ch, int key) {
        int m, c;

        m = ch - 65;

        c = (m + key) % 26;

        return (char) (c + 65);
    }

    public static char decipher (char ch, int key) {
        int m, c;

        c = ch - 65;

        m = ((c - key) + 26) % 26;

        return (char) (m + 65);
    }
}
