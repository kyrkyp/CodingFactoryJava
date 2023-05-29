package gr.aueb.cf.ch7;

public class ConcatApp {
    public static void main(String[] args) {
        String title = "Dr.";
        String firstName = "Kyriakos";
        String lastName = "Kypraios";
        String fullName;
        String titledFullName;

        fullName = firstName + lastName;
        titledFullName = title.concat(firstName).concat(lastName);

        System.out.println(fullName);
        System.out.println(titledFullName);
    }
}
