package zajavka._warsztaty.w3.Project.services;

import zajavka._warsztaty.w3.Project.domain.Purchase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileService {
    public static List<Purchase> loadData(Path path){
        try {
            Files.lines(path)
                    .skip(1)
                    .map(line -> PurchaseMappingService.newPurchase(line))
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
