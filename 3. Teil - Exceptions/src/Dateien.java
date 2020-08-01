import java.io.*;
import java.util.Scanner;

public class Dateien {

    public static void main(String[] args){

        File f = new File("file.txt");

        try {
            if(f.createNewFile()){
                System.out.println("Eine neue Datei wurde erfolgreich erstellt.");
            } else {
                System.out.println("Die Datei existiert bereits.");
            }
        } catch (IOException e) {
            System.out.println("Ein Fehler ist aufgetreten.");
            e.printStackTrace();
        }

        try {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String var = sc.nextLine();
                System.out.println(var);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(f.exists()){
            System.out.println("Name der Datei: " + f.getName());
            System.out.println("Groesse der Datei (in Bytes): " + f.length());
            System.out.println("Pfad: " + f.getPath());
        }

        // f.delete(); // loescht die erstellte Datei

    }

}
