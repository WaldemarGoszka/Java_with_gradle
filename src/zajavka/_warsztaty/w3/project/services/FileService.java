package zajavka._warsztaty.w3.project.services;

import zajavka._warsztaty.w3.project.domain.Purchase;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

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
            return Collections.emptyList();
        }
    }
    public static void saveToFile (Path path, List<String> data){
        String header = "id,first_name,last_name,email,ip_address,color,car_vin," +
                "car_company,car_model,car_model_year,car_price,country,city,date";
        saveToFile(path, data, header);

    }
    public static void saveToFile (Path path, List<String> data, String header){
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
}
