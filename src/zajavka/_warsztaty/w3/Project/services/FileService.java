package zajavka._warsztaty.w3.Project.services;

import zajavka._warsztaty.w3.Project.domain.Purchase;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
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
            throw new RuntimeException(e);
            return Collections.emptyList();
        }
    }
}
