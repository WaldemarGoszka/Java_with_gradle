package zajavka._warsztaty.w3.exercises.Six;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    //Napisz program, który zastąpi zawartość pliku tym samym tekstem ale w całości napisanym wielką
    //literą. Do wygenerowania zawartości pliku wykorzystaj https://pl.lipsum.com/.

    /*odczutujemy z pliku linie meodą Files.lines i mapujemy każdą linijkę z Stringa na Stringa
    ale metodą toUpperCase Zmieniamy wielkość liter i zamieniamy stream na liste.
    Do zapisywania używamy NewBufferedReader. Iterujemy na liście aby każdą liniję zapisać oddzielnie
    i dodać znak nowej lini metodą .newLine
     */
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/zajavka/_warsztaty/w3/exercises/Six/lorem.txt");
        convertTextFileToUpperCase(path);
    }

    private static void convertTextFileToUpperCase(Path path) throws IOException {
        List<String> data = Files.lines(path)
                .map(line -> line.toUpperCase()).toList();

        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path))
        {
            for (String line : data) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
    }
}
