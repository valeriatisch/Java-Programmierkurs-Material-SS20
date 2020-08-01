import java.util.ArrayList;

public class Assert {

    public static void main(String[] args){

        int[] zahlenarray = {5, 6, 2, 6, -1, 0};

        System.out.println(sum(zahlenarray));

    }

    public static int sum(int[] array){

        assert array.length > 0 : "Der Array ist leer";

        int ergebnis = 0;

        for(int i : array) {
            assert i > 0;
            ergebnis += i;
        }

        assert ergebnis > 0 && ergebnis < 100;

        return ergebnis;
    }

}
