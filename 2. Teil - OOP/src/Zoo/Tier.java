package Zoo;

public abstract class Tier {

    //Attribute
    double gewicht;
    int alter;
    char geschlecht;

    //Konstruktor
    public Tier(double gewicht, int alter, char geschlecht){
        this.gewicht = gewicht;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    //Verhalten - Methoden
    public void essen(){
        System.out.println("Ich esse...");
    }

    public void schlafen(){
        System.out.println("Ich schlafe...");
    }

    //Abstrakte Methode
    public abstract void bewegen();

}
