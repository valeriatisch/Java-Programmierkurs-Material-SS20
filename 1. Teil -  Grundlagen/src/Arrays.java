import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args){

        int[] array = new int[100];

        array[0] = 5;
        array[1] = 3;
        array[2] = 101;
        array[97] = 7;
        // Und der Rest wird automatisch mit 0en gefüllt.

        System.out.println(array[0] + " " + array[3]);

        String[] worte = new String[] {"Mein", "Name", "ist"};

        System.out.println(worte[0] + " " + worte[1] + " " + worte[2] + " " + "Valeria.");

        // Alle vorher gespeicherten Strings in dem Array worte existieren danach nicht mehr:
        worte = new String[50];

        System.out.println(worte[0]);

        // ArrayList vom Typ raw:
        ArrayList liste = new ArrayList();
        // Darin können wir beliebige Objekte speichern.
        liste.add("ein String");
        liste.add(354);
        liste.add(24.754);
        liste.add('c');
        // Deswegen muss dann immer gecastet werden:
        String a = (String) liste.get(0);

        int b = (int) liste.get(3);

        // Ab Java 5 können und sollten wir die Listen parametrisieren, um Fehler mit Datentypen zu vermeiden:
        ArrayList<String> string_liste = new ArrayList<>();

        string_liste.add(" nur Strings hier ");

        ArrayList<Integer> int_liste;
        int_liste = new ArrayList<Integer>();
    }
}
