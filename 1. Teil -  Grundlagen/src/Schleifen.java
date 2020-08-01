public class Schleifen {

    public static void main(String[] args){

        // While-Schleife:

        int counter = 0;

        while(counter < 10){
            System.out.println("Wir lernen Schleifen. Counter: " + counter);
            counter++;
        }

        // Do-While-Schleife:

        do{
            System.out.println("Das ist eine do-while-Schleife.");
        } while(false);

        String buchstaben = "abcdefghijkl";

        // For-Schleife:

        // Den String Character für Character ausgeben lassen:
        for(int i = 0; i < 10; i++)
            System.out.println(buchstaben.charAt(i));

        // String wird rückwärts ausgegeben:
        for(int i = buchstaben.length() - 1; i >= 0; i--){
            if(i == 3) continue;
            System.out.println(buchstaben.charAt(i));
        }

        // Endlosschleifen:
        // Kommentiert die folgende Schleife aus, damit das Programm von selbst terminiert.

        while(true){
            System.out.println("Ich laufe für immer.");
        }

        /*
        for(;;){
            System.out.println("Ich laufe für immer.");
        }
        */
    }
}
