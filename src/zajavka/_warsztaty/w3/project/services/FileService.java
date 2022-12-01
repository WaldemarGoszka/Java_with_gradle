package zajavka._warsztaty.w3.project.services;

import zajavka._warsztaty.w3.project.domain.Purchase;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
<<<<<<< HEAD
=======
import java.util.Comparator;
>>>>>>> c89ffc745cb2d702d6b8afb9528b11608d755106
import java.util.List;
import java.util.stream.Stream;

public class FileService {
    public static List<Purchase> loadData(Path path) {

        try {
            List<Purchase> purchases = Files.lines(path, Charset.defaultCharset())
                    .skip(1)
                    .map(PurchaseMappingService::newPurchase)
                    .toList();
            return purchases;
        } catch (IOException e) {
            e.printStackTrace();
<<<<<<< HEAD
            //throw new RuntimeException(e);
            return Collections.emptyList();
=======
            return Collections.emptyList();
        }
    }
    public static void saveToFile (Path path, List<String> data){
        String header = "id,first_name,last_name,email,ip_address,color,car_vin," +
                "car_company,car_model,car_model_year,car_price,country,city,date";
        saveToFile(path, data, header);

    }
    public static void saveToFile (Path path, List<String> data, String header){
        try {
            Files.createDirectories(path.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedWriter writer = Files.newBufferedWriter(path,Charset.defaultCharset())) {
            writer.write(header);
            writer.newLine();
            for (String row : data) {
                writer.write(row);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void printSizeOfFiles(Path path){
        try {
            Stream<Path> list = Files.list(path);
            list
                    .sorted((p1,p2) -> (int)getSize(p2)-(int)getSize(p1))
                    .forEach(s -> {
                        try {
                            System.out.println(s.getFileName().toString().replace("purchses-of-","")+Files.size(s));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static long getSize(Path p1) {
        try {
            return Files.size(p1);
        } catch (IOException e) {
            throw new RuntimeException(e);
>>>>>>> c89ffc745cb2d702d6b8afb9528b11608d755106
        }
    }
}
