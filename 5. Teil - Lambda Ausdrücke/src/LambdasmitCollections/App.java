package LambdasmitCollections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args){

        List<Auto> autos = Arrays.asList(
                new Auto("Honda", "Rot", 22300),
                new Auto("Toyota", "Weiss", 48000),
                new Auto("Jeep", "Schwarz", 25000),
                new Auto("Honda", "Rot", 22900),
                new Auto("Toyota", "Weiss", 48100),
                new Auto("Honda", "Rot", 32300),
                new Auto("Toyota", "Weiss", 68000)
        );

        printPreisspanne(autos);

        System.out.println();

        //Polymorphism
        System.out.println("Autos mit Preis zwischen 10000 und 45000:");
        printAutos(autos, a -> a.getPreis() > 10000 && a.getPreis() <= 45000);
        System.out.println();
        System.out.println("Rote Autos:");
        printAutos(autos, a -> a.getFarbe().equals("Rot"));

        Function<Auto, String> PreisFarbe = (a) -> "Preis: " + a.getPreis() + ", Farbe: " + a.getFarbe();
        String autoString = PreisFarbe.apply(autos.get(2));
        System.out.println();
        System.out.println("LambdasmitCollections.Auto mit Index 2: " + autoString);
    }

    public static void printPreisspanne(List<Auto> autos){
        int min = autos.get(0).getPreis();
        int max = autos.get(0).getPreis();
        for(Auto a : autos) {
            if(min > a.getPreis()) {
                min = a.getPreis();
            }
            if(max < a.getPreis()) {
                max = a.getPreis();
            }
        }

        System.out.println("Die Preisspanne liegt zwischen " + min + " und " + max + ".");
    }

    public static void printAutos(List<Auto> autos, Predicate<Auto> bdg) {
        for(Auto a : autos) {
            if(bdg.test(a)) {
                a.printAuto();
            }
        }
    }
}

@FunctionalInterface
interface Condition<T> {
    boolean test(T a);
}