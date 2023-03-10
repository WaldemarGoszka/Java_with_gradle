package zajavka._warsztaty.w3.exercises.One;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
//        Znajdź i wypisz na ekranie wszystkie pliki, które znajdują się w podanej przez Ciebie ścieżce oraz
//        mają rozszerzenie zgodne z podanym przez Ciebie rozszerzeniem. Uwzględnij wszystkie pliki w
//        katalogach zagnieżdżonych. Zaznaczę, że w zadaniu umieściliśmy pewien easter egg. Zadanie to
//        może zostać rozwiązane przy wykorzystaniu metody Files.walk(), która nie została poruszona w
//        materiałach. Żeby nie psuć sobie zabawy, spróbuj najpierw rozwiązać to zagadnienie samodzielnie,
//        korzystając z metod poruszonych w materiałach - bez używania metody Files.walk() ὠ. Następnie
//        zobacz przykładowe rozwiązanie i wykorzystanie metody Files.walk() zanim przejdziesz do
//        kolejnych zadań.
    public static void main(String[] args) {
        listSpecificFiles(Paths.get("src/zajavka/_warsztaty/w3/exercises/One"), ".png");
        System.out.println("Files.walk():");
        try
        {
            Files.walk(Paths.get("src/zajavka/_warsztaty/w3/exercises/One"))
                    .filter(p -> Files.isRegularFile(p) && p.toString().contains(".png"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void listSpecificFiles(Path path, String ext) {
        try {
            Stream<Path> list = Files.list(path);
            list.forEach(p -> {
                ifFileSpecificExtension(ext, p);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void ifFileSpecificExtension(String ext, Path p) {
        if(Files.isDirectory(p)){
            listSpecificFiles(p, ext);
        } else if (Files.isRegularFile(p) && p.toString().contains(ext)){
            System.out.println(p);
        }
    }

}
