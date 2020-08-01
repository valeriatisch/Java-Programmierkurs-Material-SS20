public class Datentypen {

    /*
    Hier schauen wir uns primitive Datentypen an.
     */

    public static void main(String[] args){
        //int steht für ganze Zahlen.
        int x = 10000000;
        int y = 7;

        //Ein String ist eine Zeichenkette.
        //Deklarieren einer Variable vom Typ String:
        String words;
        //Initialisieren der Variable words:
        words = "qwrewr reg erf erfw $%&*# 636302";

        //Überschreiben des ursprünglichen Werts von x mit 4:
        x = 4;
        //Jetzt mit 50:
        x = 50;
        //Numerische Datentypen wie int unterstützen arithmetische Operationen:
        System.out.println(x - 10);
        //Zwischen Strings steht das Plus jedoch für Konkatenation.
        System.out.println(words + " noch ein String hier");

        //Weitere Beispiele:
        long z = 100000000;
        char q = '&';
        double a = 2.4;
        boolean w = false;
        boolean t = true;
    }
}
