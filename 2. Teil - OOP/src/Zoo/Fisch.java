package Zoo;

public class Fisch extends Tier {

    public Fisch(double gewicht, int alter, char geschlecht) {
        super(gewicht, alter, geschlecht);
    }

    @Override //indiziert, dass die folgenden Methode aus der Superklasse stamm.
    public void bewegen() {
        //TODO
    }

    public void schwimmen(){
        System.out.println("Ich schwimme...");
    }

}
