package zajavka._warsztaty.w3.Exercises.Seven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    //Napisz program, który zliczy ilość słów występujących w pliku. Do wygenerowania zawartości pliku
    //wykorzystaj https://pl.lipsum.com/.
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/zajavka/_warsztaty/w3/Exercises/Seven/lorem.txt");

        long count = Files.lines(path)
                .flatMap(line -> Stream.of(line.split(" ")))
                .count();
        System.out.println(count);
        // 2 sposób
        long count2 = Files.lines(path)
                .map(line -> line.split(" ").length)
                .reduce(0, Integer::sum);
        System.out.println(count2);


    }}
