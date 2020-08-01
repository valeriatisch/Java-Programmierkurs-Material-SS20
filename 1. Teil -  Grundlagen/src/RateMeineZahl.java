/*
Das ist ein "Rate meine Zahl"-Spiel.

Es geht wie folgt:

Ihr denkt euch eine Zahl zwischen 1 und 100 aus und das Programm rät es innerhalb von 7 Schritten (logBase2(100)=7).

Angenommen ihr denkt an die Zahl 88.

Programm: Ist deine Zahl aufgerundet((100+1-1)/2) == 50?
Ihr: Nein, meine Zahl ist höher.

Programm: Ist deine Zahl aufgerundet((100+51-1)/2) == 75?
Ihr: Nein, meine Zahl ist höher.

Programm: Ist deine Zahl aufgerundet((100+76-1)/2) == 88?
Ihr: Ja
 */

import java.util.Scanner;

public class RateMeineZahl{

    public static void main(String[] args) {

        int lowRange = 1;
        int highRange = 100;
        int possibleNumbers = highRange + lowRange - 1;
        int maxQuestions = (int) Math.ceil(Math.log(possibleNumbers) / Math.log(2));

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wähle eine Zahl zwischen " + lowRange + " und " + highRange + ".");

        System.out.println("Ich rate es innerhalb von " + maxQuestions + " Schritten.");

        int guess, count = 0, numTurns = 1;
        char symbol;

        do {
            count++; // Fragen-Counter
            possibleNumbers = highRange + lowRange - 1; // Update den neuen Umfang der übrig gebliebenen Zahlen
            guess = (int) Math.ceil(possibleNumbers / 2.0); // die von uns geratene Zahl

            System.out.println("Frage " + count + ": Ist deine Zahl <, > oder = " + guess + "?");
            symbol = keyboard.next().charAt(0); // Lesen den User-Input

            if (symbol == '>')
                lowRange = guess + 1; // Update lowRange
            else if (symbol == '<')
                highRange = guess - 1; // Update highRange
            else if (symbol == '=')
                break;

            numTurns++;

        } while (symbol != '=' && numTurns <= maxQuestions);

        if (numTurns > maxQuestions)
            System.out.println("Du hast einen Fehler gemacht. Die maximale Anzahl an Schritten ist erreicht.");
        else
            System.out.println("Ich habe deine Zahl in " + numTurns + " Schritten erraten.");
    }
}
