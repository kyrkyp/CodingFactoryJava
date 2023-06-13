package gr.aueb.cf.ch11;

public class DriverApp {

    public static void main(String[] args) {
        Teacher alice = new Teacher();

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("ID: " + alice.getId());
        System.out.println("First Name: " + alice.getFirstname());
        System.out.println("Last Name: " + alice.getLastname());
    }
}
