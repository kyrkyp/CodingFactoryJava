package gr.aueb.cf.ch17.callback;

public class KnightApp {

    public static void main(String[] args) {
        IKnight kingArthur = new Knight();
        IKnight saintGeorge = new Knight();

        kingArthur.embarkOnMission(() -> System.out.println("Save the Princess"));
        saintGeorge.embarkOnMission(() -> killTheDragon());

        kingArthur.embarkOnMission(KnightApp::killTheDragon);
        saintGeorge.embarkOnMission(KnightApp::saveThePrincess);
    }

    public static void killTheDragon () {
        System.out.println("Kill the dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the princes");
    }
}
