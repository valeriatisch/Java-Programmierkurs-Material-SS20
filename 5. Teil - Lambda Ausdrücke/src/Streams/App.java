package Streams;/*
STREAMS
Source (Collections, Files, Data) -> Filter + Sort + Map (Intermediate Operations) -> Collect (Terminal Operation)
Intermediate Operations return a stream, can be chained together.
    * zero or more are allowed
    * order matters
    * threading is possible
Terminal Operations return void or a non-stream result like a list or a single value.
    * only one operation
    * collect() saves the elements into a collection
    * reduce
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args){

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(System.out::println);
        System.out.println();

        int val = IntStream
                .range(1, 5)
                .sum();
        System.out.println(val);
        System.out.println();

        Stream.of("Hallo", "Zehn", "Ball")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();

        String[] items = {"Auto", "Computer", "Mensch", "Interaktion", "Spielzeuge", "Inhalt"};
        Stream.of(items)
                .filter((x) -> x.startsWith("I"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        Arrays.stream(new int[] {4, 3, 2, 7, 9, 3, 8})
                .map((x) -> x * x)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        List<String> listOfItems = Arrays.asList("Auto", "Computer", "Mensch", "Interaktion", "Spielzeuge", "Inhalt");
        listOfItems.stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        try {
            Stream<String> zeilen = Files.lines(Paths.get("5. Teil - Lambda Ausdrücke/Dateien/woerter.txt"));
            zeilen
                    .filter(z -> z.length() > 6)
                    .sorted()
                    .forEach(System.out::println);
            zeilen.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();


        try {
            List<String> woerter = Files.lines(Paths.get("5. Teil - Lambda Ausdrücke/Dateien/woerter.txt"))
                    .filter(x -> x.contains("ss"))
                    .collect(Collectors.toList());
            woerter.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

    }
}
