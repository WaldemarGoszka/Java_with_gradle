package zajavka._warsztaty.w3.Exercises.Five;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    //Napisz program, który znajdzie drugie najdłuższe słowo i drugie słowo o długości 3 w podanym
    //przez Ciebie pliku. Do wygenerowania zawartości pliku wykorzystaj https://pl.lipsum.com/.
    public static void main(String[] args) {
        Path path = Paths.get("src/zajavka/_warsztaty/w3/Exercises/Five/lorem.txt");
        Files.lines().
                map(line -> line.replace(",", "").replace(".","").split(" "))
                .toMap

    }
}