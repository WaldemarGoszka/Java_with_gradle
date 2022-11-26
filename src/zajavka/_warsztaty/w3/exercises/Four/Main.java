package zajavka._warsztaty.w3.exercises.Four;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //Napisz program, który w podanym przez Ciebie katalogu znajdzie dowolny plik, z najstarszą i
    //najmłodszą datą modyfikacji. Przeszukaj wszystkie pliki w katalogu, również te zagłębione.
    public static void main(String[] args) {
        Path path = Paths.get("src/zajavka/_warsztaty/");
        printOldestNewest(path);
    }

    private static void printOldestNewest(Path path) {
        try {
            List<Path> collect = Files.walk(path)
                    .filter(file -> Files.isRegularFile(file))
                    .sorted((a, b) -> {
                        try {
                            return Files.getLastModifiedTime(a).compareTo(Files.getLastModifiedTime(b));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .collect(Collectors.toList());
            System.out.println("Newest: "+collect.get(collect.size()-1));
            System.out.println("Oldest: "+collect.get(0));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
