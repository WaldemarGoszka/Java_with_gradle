package pl.zajavka._warsztaty;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main implements Interf{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.removeIf((String s) ->  s.contains("a"));

        String s = "boot.txt";
        try {
            Path path = Paths.get(".").toRealPath();
            Files.list(path)
                    .filter(x -> x.getFileName().toString().endsWith(".txt"))
                    .forEach(System.out::println);
            List<Object> of = List.of();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
