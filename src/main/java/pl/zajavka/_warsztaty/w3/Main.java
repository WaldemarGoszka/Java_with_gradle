package pl.zajavka._warsztaty.w3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("src/zajavka/_warsztaty");
        TreeMap<FileTime,Path> fileTimePathTreeMap = new TreeMap<>();
        
        try (Stream<Path> pathStream = Files.walk(path) ){
            TreeMap<FileTime, ArrayList<Path>> collect = pathStream
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toMap(
                            path1 -> getModifiedTime(path1),
                            path1 -> new ArrayList<Path>(List.of(path1)),
                            (p1,  p2) -> {p1.addAll(p2); return p1;},
                            TreeMap::new
                    ));
            System.out.println(collect);




//            sortedPaths = Files.walk(path)
//                    .filter(Files::isRegularFile)
//                    .sorted(Comparator.comparing(E2::getFileTime))
//                    .toList();
        } catch (IOException e) {
            System.err.println("Error during Files.walk() for path:  " + path + ", message: " + e.getMessage());
        }
//        if (sortedPaths.isEmpty()) {
//            System.out.println("No files found.");
//            return;
//        }
//        System.out.printf("Oldest file is: [%s] while newest is: [%s]",
//                sortedPaths.get(0), sortedPaths.get(sortedPaths.size()-1));
    }

    private static FileTime getModifiedTime(Path path1)  {
        try {
            return Files.getLastModifiedTime(path1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static FileTime getFileTime(Path path) {
        try {
            return Files.getLastModifiedTime(path);
        } catch (IOException e) {
            System.err.println("Unable to get file time for path:  " + path + ", message: " + e.getMessage());
            return FileTime.fromMillis(0);
        }
    }
}
