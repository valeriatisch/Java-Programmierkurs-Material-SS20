import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte gib hier ein Wort ein:");
        String input = scan.nextLine();
        System.out.println(input);
        */

        try {
            File f = new File("myfile.txt");
            Scanner scan = null;
            scan = new Scanner(f);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Das ist ausserhalb des try-catch-Blocks");

        try {
            System.out.println(subtract5FromLargerNumber(4));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static int subtract5FromLargerNumber(int nr) throws Exception{

        if(nr > 5) {
            return nr - 5;
        } else {
            throw new Exception("ERROR. Die Zahl ist kleiner oder gleich 5.");
        }

    }

}
