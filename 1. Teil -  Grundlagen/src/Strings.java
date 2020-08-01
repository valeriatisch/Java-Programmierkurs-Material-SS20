import java.util.ArrayList;

public class Strings {

    public static void main(String[] args){

        String s = new String(); // Das ist redundant, weil Strings immutable sind.

        s = "Informatik";

        s = "Medieninformatik";

        int laenge = s.length();

        System.out.println(laenge);

        String sub_string1 = s.substring(6); // Gibt uns den String ab Index 6.
        String sub_string2 = s.substring(3, 6); // Gibt uns den String zwischen Index 3 und 6.

        System.out.println(sub_string1);

        if(s == "Medieninformatik"){
            // Das nicht machen, weil hier die Referenzen verglichen werden.
        }

        // Strings sollten prinzipiell mit equals() verglichen werden.
        if(s.equalsIgnoreCase("medieninformatik")){
            System.out.println("Richtig");
        }

    }

}
