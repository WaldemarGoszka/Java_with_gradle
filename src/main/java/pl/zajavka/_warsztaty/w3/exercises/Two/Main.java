package zajavka._warsztaty.w3.exercises.Two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    //    Wypisz na ekranie ścieżki wszystkich plików które zostały znalezione w podanej przez Ciebie
//    ścieżce. Uwzględnij tylko te pliki tekstowe, które zawierają w swojej treści słowo zajavka. Dodaj
//    możliwość podania rozszerzeń plików do pominięcia, gdyż niektóre z nich, np. .docx powodują błędy
//    przy odczycie. Uwzględnij wszystkie pliki w katalogach zagnieżdżonych.
    public static void main(String[] args) {
        Path rootPath = Paths.get("./src/zajavka/_warsztaty/w3/exercises/");
        String searcherWord = "zajavka";
        List<String> prohibitExtensions = List.of(".doc", ".java");
        printSpecificPaths(rootPath, searcherWord, prohibitExtensions);
    }

    private static void printSpecificPaths(Path rootPath, String searcherWord, List<String> prohibitExtensions) {
        try {
            Files.walk(rootPath)
                    .filter(file -> checkTypeOfFile(file,prohibitExtensions))
                    .filter(file -> {
                        return checkLines(searcherWord, file);
                    })
                    .forEach(file -> System.out.println(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean checkTypeOfFile(Path file,List<String> prohibitExtensions) {
        for (String prohibitExtension : prohibitExtensions) {
            if(file.toFile().toString().contains(prohibitExtension)){
                return false;
            }
        }
        return Files.isRegularFile(file);
    }

    private static boolean checkLines(String searcherWord, Path file) {
        try {
            return Files.lines(file).anyMatch(line -> line.contains(searcherWord));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
