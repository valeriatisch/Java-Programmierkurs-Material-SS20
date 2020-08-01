public class Kontrollstrukturen {

    public static void main(String[] args){

        // Verändert die Werte der Variablen und schaut, was passiert.

        int x = 4;
        int y = 6;

        if(x < y){
            System.out.println("x ist kleiner als y.");
            if(x < 0){
                System.out.println("x ist eine negative Zahl.");
            }
        } else if (x > y && x > 0){
            System.out.println("x ist größer als y und eine positive Zahl.");
        } else if((x == 0 && x != 1) || (x == 1 && x != 0)){
            System.out.println("x ist entweder 0 oder 1.");
        }

        int tag = 3;

        switch(tag){
            case 1: System.out.println("Es ist Montag."); break;
            case 2: System.out.println("Es ist Dienstag."); break;
            case 3: System.out.println("Es ist Mittwoch."); break;
            default: System.out.println("Es ist irgendein Tag zwischen Donnerstag und Sonntag.");
        }

    }
}
