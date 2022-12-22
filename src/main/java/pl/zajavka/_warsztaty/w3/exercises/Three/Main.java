package zajavka._warsztaty.w3.exercises.Three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    //Napisz program, który na podstawie podanego pliku wydrukuje jego rozmiar w bajtach, kb, mb.
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/zajavka/_warsztaty/w3/exercises/One/text.doc");
        printFileSize(path);
    }

    private static void printFileSize(Path path) throws IOException {
            long size = Files.size(path);
        System.out.println(size/1024.0);
    }
}
