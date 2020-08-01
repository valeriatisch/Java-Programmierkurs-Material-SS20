package Zoo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Vogel vogel_1 = new Vogel(1.5, 10, 'M');
        vogel_1.essen();

        Fisch fisch_1 = new Fisch(2.6, 4, 'W');
        fisch_1.schlafen();
        fisch_1.schwimmen();

        Huhn h = new Huhn(4.0, 20, 'W');
        h.essen();

        Taube t = new Taube(2.0, 20, 'W');
        t.fliegen();

    }

}