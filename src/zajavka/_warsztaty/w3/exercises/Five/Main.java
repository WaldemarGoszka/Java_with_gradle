package zajavka._warsztaty.w3.exercises.Five;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    //Napisz program, który znajdzie drugie najdłuższe słowo i drugie słowo o długości 3 w podanym
    //przez Ciebie pliku. Do wygenerowania zawartości pliku wykorzystaj https://pl.lipsum.com/.

    /*
    naszym celem jest otrzymanie mapy z kluczem - długością wyrazów i wartością listą wyrzów które posiadają
    taką długość. Aby to zrobić musimy pozbyć się znaków przestankowych zrobić kolekcje z samych wyrazów
    i zrobić na nim streama aby pogrupować wyrazy do kolekcji Map

    odzcytujemy plik metodą Files.lines który odczytuje każdą linijkę
    mapujemy linijkę i wyrzucamy z niej kropki i przecinki i zamieniamy na tablicę(.split) rozdzielając każdy
     wyraz oddzielnie.Teraz kazda linijka jest reprezentowan przez tablice.
     Potrzebujemy zrobić z tej tablicy stream. Możemy to zrobić z tablicy liste i z listy steam albo meodą
     Stream.of która przyjmuje tablice jako parametr. Zmowu mapujemy tablicę na stream.
     Mapując dostajemy Sream streamów dlatefo używamy metody .flatMap która wypakowuje nam z jedego
     zagłębienia Sereama. Potem stosujemy gruopingBy aby stworzyć mapę z liczbą znaków listą wyrazów.
      Musimy wyciągnąć maksymalną watrość klucza, zamieniamy mapę na Set metodą .keySet i wyciągamy wartość
      maksymalną metodą .max inteliJ podpowiada że musimy najpierw zamienić na stream i potem na stewamie
      wykonujemy metode .max a w niej podajemu comparator (a,b) -> a-b)

    * */
    public static void main(String[] args) {
        Path path = Paths.get("src/zajavka/_warsztaty/w3/exercises/Five/lorem.txt");
        try {
            Map<Integer, List<String>> collect = Files.lines(path).
                    map(line -> line.replace(",", "").replace(".", "").split(" "))
                    .flatMap(table -> Stream.of(table))
                    .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
            System.out.println(collect);
            Integer maxKey = collect.keySet().stream().max((a, b) -> a - b).orElse(0);
            System.out.printf("Second longest world is: %s, while second 3-letter word is %s "
                    ,collect.get(maxKey).get(1)
                    ,collect.get(3).get(1)
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
