import java.util.ArrayList;

public class Methoden {

    public static void main(String[] args){

        methode();

        ArrayList<Integer> zahlen = new ArrayList<>();

        //Befüllen des Arrays:
        for(int i = 1; i < 11; i++){
            zahlen.add(i);
        }

        System.out.println(durchschnitt_berechnen(zahlen));


    }

    public static void methode(){
        System.out.println("Ich gebe nichts zurück, weil ich eine void-Methode bin.");
    }

    /**
     * @param liste erwartet eine ArrayList mit Integern
     * @return den Durchschnitt der Zahlen in der übergebenen Liste
     */
    public static int durchschnitt_berechnen(ArrayList<Integer> liste){

        int hilfsvariable = 0;

        for(int i : liste){
            hilfsvariable += i;
        }

        return hilfsvariable / liste.size();

    }

}
