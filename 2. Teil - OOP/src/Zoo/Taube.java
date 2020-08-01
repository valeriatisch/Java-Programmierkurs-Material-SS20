package Zoo;

public class Taube extends Vogel implements Flugfaehig{

    public Taube(double gewicht, int alter, char geschlecht) {
        super(gewicht, alter, geschlecht);
    }

    @Override
    public void fliegen() {
        System.out.println("Ich fliege...");
    }
}
